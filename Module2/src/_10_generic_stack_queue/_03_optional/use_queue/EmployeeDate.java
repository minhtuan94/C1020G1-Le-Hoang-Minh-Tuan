package _10_generic_stack_queue._03_optional.use_queue;

import java.util.*;

public class EmployeeDate implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDate() - o2.getDate();
    }

}