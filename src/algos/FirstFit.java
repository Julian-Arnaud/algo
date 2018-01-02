package src.algos;

import src.system.Bin;
import src.system.ReadFile;

import java.util.ArrayList;
import java.util.List;

public class FirstFit {
    private List<Bin> bins;
    private ReadFile inFile;

    public FirstFit(ArrayList<Bin> b, ReadFile file){
        bins = b;
        inFile = file;

        this.operate();
    }

    private void operate(){

    }
}
