package _09_danhsach._02_exercise.arraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0; //số lượng phần tử có trong arrayList
    private static final int DEFAULT_CAPACITY = 10;// sức chứa trong arrayList

    Object elements[]; //mảng chứa các phần tử trả về

    //sức chứa mặc định khi khởi tạo bằng contructor không có tham số
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //phương thức constructor với sức chứa đc truyền vào
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    //phương thức trả về số lượng phần tử
    public int size() {
        return this.size;
    }

    //phương thức clear ArrayList
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    //phương thức add 1 phần tử vào MyArrayList
    public boolean add(E element) {
        if (elements.length == size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: "+ index);
        } else if (elements.length == size){
            this.ensureCapacity(5);
        }
        if (elements[index]==null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size+1;i>=index;i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }

    //phương thức tăng kích thước của mảng MyArrayList
    public void ensureCapacity(int minCapacity){
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: "+ minCapacity);
        }
    }

    //phương thức lấy 1 element tại vị trí index
    public E get(int index){
        return (E) elements[index];
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0;i<size; i++) {
            if (this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }

    //phương thức kiểm tra 1 phần tử có trong MyArrayList hay không
    public boolean contains(E element) {
        return this.indexOf(element) >=0;
    }

    //phương thức tạo ra bản sao của MyArrayList
    public MyArrayList<E> clone() {
        MyArrayList<E> v= new MyArrayList<>();
        v.elements = Arrays.copyOf(this.elements,this.size);
        v.size = this.size;
        return v;
    }

    public E remove(int index) {
        if (index <0||index>elements.length) {
            throw new IllegalArgumentException("Error index: "+index);
        }
        E element = (E) elements[index];
        for (int i=index;i<size-1;i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return element;
    }
}