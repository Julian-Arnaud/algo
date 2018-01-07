package system;

public class Chrono {
    private long start;
    private long stop;

    private long time;

    public Chrono(){
        start = 0;
        stop = 0;
        time = 0;
    }

    public void start(){
        start = System.nanoTime();
    }

    public void stop(){
        stop = System.nanoTime();

        time = stop - start;
    }

    public long getTime(){
        return time;
    }
}
