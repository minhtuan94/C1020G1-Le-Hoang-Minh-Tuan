package _09_danhsach._02_exercise.arraylist;

public class TestMyArrayList {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Student a = new Student(1,"Huy");
            Student b = new Student(2,"Thịnh");
            Student c = new Student(3,"Tuấn");
            Student d = new Student(4,"Dương");
            Student e = new Student(5,"Phúc");
//            Student f = new Student(4,"Tuấn2");

            MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
            MyArrayList<Student> newArrayList = new MyArrayList<>();
            studentMyArrayList.add(a);
            studentMyArrayList.add(b);
            studentMyArrayList.add(c);
            studentMyArrayList.add(d);
            studentMyArrayList.add(e);
//            studentMyArrayList.add(f, 2);

            for (int i = 0; i<studentMyArrayList.size();i++) {
                Student student = (Student) studentMyArrayList.elements[i];
                System.out.print(student.getId()+"\t");
                System.out.println(student.getName());
            }
            System.out.println("kích thước mảng: "+studentMyArrayList.size());
            System.out.println(studentMyArrayList.get(2).getName());
            System.out.println(studentMyArrayList.indexOf(a));
            System.out.println(studentMyArrayList.contains(c));
            newArrayList = studentMyArrayList.clone();
            newArrayList.remove(4);
            for (int i=0;i<newArrayList.size();i++){
                System.out.println(newArrayList.get(i).getName());
            }
        }
    }
}