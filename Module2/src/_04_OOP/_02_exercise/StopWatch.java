package _04_OOP._02_exercise;

import java.awt.*;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;
    private long startTimeLong;
    private long endTimeLong;
    public StopWatch() {
    }
    public LocalTime getStartTime() {
        this.startTime = java.time.LocalTime.now();
        setStartTimeLong();
        return this.startTime;
    }
    public LocalTime getEndTime() {
        this.endTime = java.time.LocalTime.now();
        setEndTimeLong();
        return this.endTime;
    }
    public void setStartTimeLong() {
        this.startTimeLong = System.currentTimeMillis();
    }
    public void setEndTimeLong() {
        this.endTimeLong = System.currentTimeMillis();
    }
    public long getStartTimeLong() {
        return this.startTimeLong;
    }
    public long getEndTimeLong() {
        return this.endTimeLong;
    }
    public long calculator(){
        return  getEndTimeLong() - getStartTimeLong();
    }

    public static void main(String[] args) {
        int[] arr = new int[10000];
        int temp = 0;
        StopWatch check = new StopWatch();
        System.out.println(check.getStartTime());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10000);;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(check.getEndTime());
        System.out.println(check.getStartTimeLong());
        System.out.println(check.getEndTimeLong());
        System.out.println(check.calculator());
    }
}
