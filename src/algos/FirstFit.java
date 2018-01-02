package algos;

import system.Bin;
import system.Chrono;
import system.ReadFile;

import java.util.ArrayList;
import java.util.List;

public class FirstFit extends Fit {

    public FirstFit(ReadFile file){
        bins = new ArrayList<>();
        inFile = file;

        this.operate();
    }

    private void operate(){
        Chrono chrono = new Chrono();
        chrono.Start();
        boolean placed = false;
        bins.add(new Bin(inFile.getBinSize()));
        for(Integer i : inFile.getListOfValues()){
            for (Bin b : bins)
            {
                if (b.getRemainingSpace() > i)
                {
                    b.putObject(i);
                    placed = true;
                    break;
                }
            }
            if (!placed)
            {
                Bin newBin = new Bin(inFile.getBinSize());
                newBin.putObject(i);
                bins.add(newBin);
            }
            placed = false;
        }
        chrono.Stop();
        System.out.println("Temps en ms: " + chrono.getTime());
    }

}
