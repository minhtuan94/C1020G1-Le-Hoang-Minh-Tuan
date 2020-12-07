package _05_access_modify._02_exercise.access_modifier;

public class testdt {
    public static void main(String[] args) {
        Test test = new Test("kiên", 5);
        Test test1 = new Test("long", 6);
        test.school = "Hà Nội";
        System.out.println(Test.school);
        System.out.println(test1.school);
    }
}
