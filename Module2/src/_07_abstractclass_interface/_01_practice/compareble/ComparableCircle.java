package _07_abstractclass_interface._01_practice.compareble;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double v, String indigo, boolean b) {
    }

    public ComparableCircle(double v) {
    }

    public ComparableCircle() {

    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}