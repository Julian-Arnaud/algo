package algos;

import system.Chrono;
import system.Bin;
import system.ReadFile;

import java.util.ArrayList;

public class NextFit extends Fit {

    public NextFit(ReadFile file){
        bins = new ArrayList<>();
        inFile = file;

        this.operate();
    }

    private void operate(){
        Chrono chrono = new Chrono();
        chrono.start();
        int pos = 0;
        bins.add(new Bin(inFile.getBinSize()));
        for(Integer i : inFile.getListOfValues()){
            if(bins.get(pos).getRemainingSpace() >= i) bins.get(pos).putObject(i);
            else{
                bins.add(new Bin(inFile.getBinSize()));
                pos++;
                bins.get(pos).putObject(i);
            }
        }
        chrono.stop();
        System.out.println("Temps en ns: " + chrono.getTime());
    }

}
