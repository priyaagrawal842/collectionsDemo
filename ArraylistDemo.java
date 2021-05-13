import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {

    public static void main(String[] args)
    {
        //Inserting integer values
        List<Integer> list1 = new ArrayList<>();
        list1.add(101);
        list1.add(102);
        list1.add(103);
        list1.add(104);

        System.out.println(list1);

        //Inserting an Employee object
            List<Employee> employeeList= new ArrayList<>();
            employeeList.add(new Employee ("1", "priya","agrawal"));
            for(Employee e: employeeList)
                {
                    System.out.println(e.getId()   +  e.getName() + e.getSurname());
                }





    }
}
