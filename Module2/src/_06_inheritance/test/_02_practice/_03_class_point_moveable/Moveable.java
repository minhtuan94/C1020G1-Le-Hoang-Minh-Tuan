package _06_inheritance.test._02_practice._03_class_point_moveable;

public class Moveable extends Point {
    public float xSpeed;
    public float ySpeed;

    public Moveable(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Moveable(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Moveable(){

    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }

    public Moveable move() {
        x += this.xSpeed;
        y += this.ySpeed;
        return this;
    }

    public String toString() {
        return "("+getX()+","+getY()+"),"+getSpeed()+"=("+getXSpeed()+","+getYSpeed()+")";
    }
}
