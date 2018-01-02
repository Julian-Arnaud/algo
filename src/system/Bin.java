package system;

public class Bin {
    private int capacityMax;
    private int space;

    public Bin(int c){
        capacityMax = c;
        space = 0;
    }

    public int getCapacityMax(){
        return capacityMax;
    }

    public int getSpace() {
        return space;
    }

    public boolean putObject(int val){
        if(space + val > capacityMax) return false;
        space += val;
        return true;
    }

    public int getRemainingSpace(){
        return capacityMax - space;
    }
}
