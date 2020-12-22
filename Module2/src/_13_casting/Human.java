package _13_casting;

public class Human extends Person {
    public Human() {
        super();
    }

    public Human(String name, int age) {
        super(name, age);
    }

    public void showInfo(){
        System.out.println("Human:" + super.getName());
    }
}
