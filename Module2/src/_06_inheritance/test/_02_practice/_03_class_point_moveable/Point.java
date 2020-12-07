package _06_inheritance.test._02_practice._03_class_point_moveable;

public class Point {

    public float x;
    public float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float [] getXY() {
        return new float[]{this.x,this.y};
    }

    public String toString() {
        return "("+getX()+","+getY()+")";
    }
}
