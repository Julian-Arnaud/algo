package algos;

import system.Bin;
import system.ReadFile;

public class FirstFit extends Fit {

    public FirstFit(ReadFile file){
        super(file);
    }

    public void operate(){
        boolean placed = false;
        bins.add(new Bin(inFile.getBinSize()));
        for(Integer i : inFile.getListOfValues()){
            for (Bin b : bins)
            {
                if (b.getRemainingSpace() >= i)
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
    }

}
