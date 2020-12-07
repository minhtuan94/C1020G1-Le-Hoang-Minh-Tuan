package _06_inheritance.test._02_practice._02_class_2d_3d;

public class Point3D extends Point2D {
    public float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {

    }
    public Point3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float [] getXYZ() {
        return new float[]{this.x,this.y,this.z};
    }

    public String toString() {
        return "("+getX()+","+getY()+","+getZ()+")";
    }
}