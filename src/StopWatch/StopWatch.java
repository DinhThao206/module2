package StopWatch;

public class StopWatch {
 private long startTime;
 private long endTime;
    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
