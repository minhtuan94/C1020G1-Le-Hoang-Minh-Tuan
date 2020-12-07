package _04_OOP.stop_watch;

public class Test {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());

        stopWatch.stop();
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());

    }
}
