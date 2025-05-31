import java.util.*;
class EmployeeArraow{
 
 public static void main(String ar[]){
    List<Employee> list=Arrays.asList(new Employee(1,"A"),
      new Employee(2,"b"),
      new Employee(3,"C"));

      list.forEach(e->{
        if(e.getId()==2){
                e.setName(e.getName().toUpperCase());
                System.out.println(e.getName());
        }
      });
 }
}