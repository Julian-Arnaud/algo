package algos;

import system.Bin;
import system.ReadFile;

public class NextFit extends Fit {

    public NextFit(ReadFile file){
        super(file);
    }

    public void operate(){
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
    }

}
