package algos;

import system.Bin;
import system.Chrono;
import system.ReadFile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Renaud on 02/01/2018.
 */
public abstract class Fit {

    List<Bin> bins;
    ReadFile inFile;
    private double time;

    Fit(ReadFile file){
        bins = new ArrayList<>();
        inFile = file;
        operateMain();
    }

    public double getTime(){
        return time;
    }

    private void operateMain(){
        Chrono chrono = new Chrono();
        chrono.start();
        operate();
        chrono.stop();
        time = chrono.getTime();
    }

    public void print(){
        System.out.println("Nombre de bins : " + countNbBins());
        System.out.println("Temps en ns : " + getTime() + "\n");
    }

    public abstract void operate();
    public int countNbBins()
    {
        return bins.size();
    }
}
