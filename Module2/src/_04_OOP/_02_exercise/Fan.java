package _04_OOP._02_exercise;

public class Fan {

    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public Fan() {
    }

    public static int getSLOW() {
        return SLOW;
    }

    public static int getMEDIUM() {
        return MEDIUM;
    }

    public static int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Fan is on: "+getColor()+" "+getSpeed()+" "+getRadius();
        } else {
            return "Fan is off: "+getColor()+" "+getRadius();
        }
    }

    public static void main(String[] args) {
        Fan fan_1 = new Fan(3,true,10,"yellow");
        Fan fan_2 = new Fan(2,false,5,"blue");

        System.out.println(fan_1.toString());
        System.out.println(fan_2.toString());
    }
}
