package _05_access_modify._02_exercise.access_modifier;

public class Test {
    public String name;
    private int age;
    static String school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static {
        school = "Codegym";
    }

}
