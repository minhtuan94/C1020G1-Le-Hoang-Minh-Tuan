package _04_OOP.stop_watch;

public class StopWatch {
    private double startTime;
    private double endTime;
    public static int count =0;

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public StopWatch() {
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime () {
        return this.endTime - this.startTime;
    }


}
