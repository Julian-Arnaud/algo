package src.algos;

import src.system.Chrono;
import src.system.Bin;
import src.system.ReadFile;

import java.util.ArrayList;
import java.util.List;

public class NextFit {
    private List<Bin> bins;
    private ReadFile inFile;

    public NextFit(ReadFile file){
        bins = new ArrayList<>();
        inFile = file;

        this.operate();
    }

    private void operate(){
        Chrono chrono = new Chrono();
        chrono.Start();
        int pos = 0;
        bins.add(new Bin(inFile.getBinSize()));
        for(Integer i : inFile.getListOfValues()){
            if(bins.get(pos).getRemainingSpace() > i) bins.get(pos).putObject(i);
            else{
                bins.add(new Bin(inFile.getBinSize()));
                pos++;
                bins.get(pos).putObject(i);
            }
        }
        chrono.Stop();
        System.out.println("Temps en ms: " + chrono.getTime());
    }

    public int countNbBins(){
        return bins.size();
    }
}
