package _10_generic_stack_queue._03_optional.use_queue;

import java.util.*;

public class EmployeeOrganizeData {
    public static void main(String[] args) {
        Queue<Employee> nam = new LinkedList<>();
        Queue<Employee> nu = new LinkedList<>();

        List<Employee> list= new ArrayList<>();

        list.add(new Employee("Phúc","male",12));
        list.add(new Employee("Tuấn","male",22));
        list.add(new Employee("Kiên","male",32));
        list.add(new Employee("Cao","male",14));
        list.add(new Employee("Dương","male",121));
        list.add(new Employee("Thanh","female",162));
        list.add(new Employee("Trang","female",112));
        list.add(new Employee("Trung","male",123));
        list.add(new Employee("Yến","female",125));
        list.add(new Employee("Thịnh","male",152));
        list.add(new Employee("Long","male",152));

        Collections.sort(list,new EmployeeDate());

        for(Employee elenent: list){
            System.out.println(elenent);
        }
        System.out.println();

        for (Employee element : list){
            if (element.getGender().equals("male")) {
                nam.add(element);
            } else {
                nu.add(element);
            }
        }
        list.clear();
        while (!nam.isEmpty()){
            list.add(nam.poll());
        }
        while (!nu.isEmpty()){
            list.add(nu.poll());
        }
//        EmployeeDate comparator = new EmployeeDate();

        for(Employee elenent: list){
            System.out.println(elenent);
        }
     }
}
