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
        start = java.lang.System.currentTimeMillis();
    }

    public void stop(){
        stop = java.lang.System.currentTimeMillis();

        time = stop - start;
    }

    public long getTime(){
        return time;
    }
}
