package algos;

import system.Bin;
import system.ReadFile;

import java.util.Collections;

public class BestFit extends algos.Fit{

    public BestFit(ReadFile file){
        super(file);
    }

    public void operate(){

        bins.add(new Bin(inFile.getBinSize()));

        for(Integer i : inFile.getListOfValues()){
            Collections.sort(bins);
            Collections.reverse(bins);

            boolean placed = false;
            for(int k = 0; k < bins.size() && !placed; ++k){
                if(bins.get(k).getRemainingSpace() >= i){
                    bins.get(k).putObject(i);
                    placed = true;
                }
            }

            if (!placed)
            {
                Bin newBin = new Bin(inFile.getBinSize());
                newBin.putObject(i);
                bins.add(newBin);

            }

        }
    }
}
