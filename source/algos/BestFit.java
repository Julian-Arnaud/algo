package algos;

import java.util.ArrayList;

public class BestFit extends algos.Fit{

    public BestFit(system.ReadFile file){
        bins = new ArrayList<>();
        inFile = file;

        this.operate();
    }

    public void operate(){
        system.Chrono chrono = new system.Chrono();
        chrono.start();


        // On surdimensionne expres
        for(int i = 0; i < 10000; ++i){
            bins.add(new system.Bin(inFile.getBinSize()));
        }
        //-------------//

        for(Integer j : inFile.getListOfValues()){
            int bestPos = -1;
            for(int k = 0; k < bins.size(); ++k){
                if(bins.get(k).getRemainingSpace() >= j){
                    if(bestPos == -1) bestPos = k;
                    else if(bins.get(bestPos).getRemainingSpace() > bins.get(k).getRemainingSpace()) bestPos = k;
                }
            }

            if(bestPos != -1){
                bins.get(bestPos).putObject(j);
            }
        }

        chrono.stop();
        System.out.println("Temps en ns: " + chrono.getTime());
    }
}
