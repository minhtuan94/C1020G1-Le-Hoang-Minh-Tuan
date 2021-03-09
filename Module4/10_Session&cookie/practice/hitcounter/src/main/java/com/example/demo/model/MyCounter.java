package com.example.demo.model;

public class MyCounter {
    private int count;

    public MyCounter() {
    }

    public MyCounter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //Trong lớp MyCounter chúng ta khai báo một biến count để tăng lượt view sau mỗi lần người dùng truy cập trang
    // và một phương thức increment() để thi hành việc tăng giá trị cho biến count.
    public int increment() {
        return count++;
    }
}