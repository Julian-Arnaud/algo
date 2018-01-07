package algos;

import system.Bin;
import system.ReadFile;

import java.util.Collections;


/**
 * Created by Desla on 04/01/2018.
 */
public class AlmostWorstFit extends Fit {

    public AlmostWorstFit(ReadFile file) {
        super(file);
    }

    private Bin getSecondEmptiestBin(int i) {
        Collections.sort(bins);
        //printBins();
        if (twoBinsCanHandle(i)) {
            return bins.get(getFirstBinIdWhichCanHandle(i) + 1);
        } else {
            Bin newOne = new Bin(inFile.getBinSize());
            bins.add(newOne);
            return newOne;
        }
    }

    private int getFirstBinIdWhichCanHandle(int resource) {
        for (int i = 0; i < bins.size(); i++) {
            if (bins.get(i).getRemainingSpace() >= resource) return i;
        }
        return 0;
    }

    private boolean twoBinsCanHandle(int resources) {
        int count = 0;
        for (Bin bin : bins) {
            if (bin.getRemainingSpace() >= resources) count++;
            if (count == 2) return true;
        }
        return false;
    }

    private void printBins() {
        for (Bin bin : bins) {
            System.out.println(bin.getRemainingSpace());
        }
        System.out.println();
    }

    public void operate() {
        bins.add(new Bin(inFile.getBinSize()));
        bins.add(new Bin(inFile.getBinSize()));
        for (Integer i : inFile.getListOfValues()) {
            Bin secondEmptiest = getSecondEmptiestBin(i);
            secondEmptiest.putObject(i);
        }
    }

}
