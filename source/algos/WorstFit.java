package algos;

import system.Bin;
import system.Chrono;
import system.ReadFile;

import java.util.ArrayList;

/**
 * Created by Renaud on 02/01/2018.
 */
public class WorstFit extends Fit {

    public WorstFit(ReadFile file) {
        bins = new ArrayList<>();
        inFile = file;

        this.operate();
    }

    private Bin getEmptiestBin() {
        int id = 0;
        int min = bins.get(0).getRemainingSpace();
        for (int i = 1; i < bins.size(); i++) {
            if (bins.get(i).getRemainingSpace() > min) {
                id = i;
                min = bins.get(i).getRemainingSpace();
            }
        }
        return bins.get(id);
    }

    private void operate() {
        Chrono chrono = new Chrono();
        chrono.start();

        bins.add(new Bin(inFile.getBinSize()));
        for (Integer i : inFile.getListOfValues()) {
            Bin emptiest = getEmptiestBin();
            if (emptiest.getRemainingSpace() < i) {
                bins.add(new Bin(inFile.getBinSize()));
                emptiest = getEmptiestBin();
            }
            emptiest.putObject(i);
        }
        chrono.stop();
        System.out.println("Temps en ms: " + chrono.getTime());
    }

}
