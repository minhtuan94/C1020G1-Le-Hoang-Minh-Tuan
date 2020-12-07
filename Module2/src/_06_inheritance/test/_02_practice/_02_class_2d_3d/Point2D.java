package _06_inheritance.test._02_practice._02_class_2d_3d;

public class Point2D {
    public float x;
    public float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
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
        return new float[]{this.x, this.y};
    }

    public String toString() {
        return "{"+getX()+","+getY()+"}";
    }
}
