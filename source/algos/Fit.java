package algos;

import system.Bin;
import system.ReadFile;

import java.util.List;

/**
 * Created by Renaud on 02/01/2018.
 */
public abstract class Fit {

    protected List<Bin> bins;
    protected ReadFile inFile;

    private void operate()
    {

    }
    public int countNbBins()
    {
        return bins.size();
    }
}
