package algos;

public class BestFit extends algos.Fit{

    public BestFit(system.ReadFile file){
        super(file);
    }

    public void operate(){
        // Pour savoir de combien de bin on va avoir besoin
        // Je pars donc sur une moyenne des valeurs à gérer
        int sum = 0;
        int cpt = 0;
        for(Integer i : inFile.getListOfValues()){
            sum += i;
            cpt++;
        }
        sum = sum / cpt;

        for(int i = 0; i < sum; ++i){
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
    }
}
