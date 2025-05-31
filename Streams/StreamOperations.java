// There are two of operations

// 1->Intermediate Operation
// 2->Terminal Operation

// 1->when we call a method belongs to Intermediate operation it will always returns another stream object of the operations  result 
// we can call many intermediate operations on same stream instances as chanin of methods
// this is called as pipelined on same stream source.
// intermediate operations are executed only once when we invoke terminal operation.

// 2->we can call only terminal method on any stream instances
// when we call terminal method immediately we will get the result of all pipelined operations on the stream object.
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
// import java.util.function.Stream.*;
class StreamOperations{
    public static void main(String ar[]){
  List<Employee> emp = Arrays.asList(
            new Employee(1, "a"),
            new Employee(2, "b"),
            new Employee(3, "c"),
            new Employee(4, "d"),
            new Employee(5, "e"),
            new Employee(6, "f"),
            new Employee(7, "g"),
            new Employee(8, "a"),
            new Employee(9, "b"),
            new Employee(10, "c")
        );

//         List<String> eobj = new ArrayList<>();

//         emp.stream()
//             .filter(e -> e.getId() > 6)           // Intermediate operation
//             .map(Employee::getName)               // Intermediate operation
//             .forEach(eobj::add);                  // Terminal operation

//         // Print the result
//         System.out.println("Names of employees with ID > 6: " + eobj);

// //stream pipeline
//         Stream<Employee> employeeStream=emp.stream();
//        List<String> eData = emp.stream()
//                         .map(Employee::getName).toList(); 

//         System.out.println(eData);
//     }

//important methods distinct() .count() .limit(..)  anyMatch()
//printing different names using distinct 

emp.stream()
.filter(id->id.getId()>6)
.distinct()
.forEach(System.out::println);

long a=emp.stream().filter(ed->ed.getId()>3).count();
System.out.println(a);

long a2=emp.stream().map(Employee::getName).distinct().count();
System.out.println(a2);

//limit
List<Employee> limi=emp.stream().limit(3).toList();
System.out.println(limi);

// skip first 3 employees
System.out.println("skip:"+emp.stream().skip(3).toList());

//anyMatch()
boolean isMatch=emp.stream().anyMatch(ede->ede.getName()=="a");
System.out.println("AnyMatch:"+isMatch);

//allMatch()
boolean isAllMatch=emp.stream().allMatch(empa->empa.getId()>0);
System.out.println(isAllMatch);

//noneMatch() is opposite to both the above methos allMatch() and anyMatch()
boolean isNoneMatch=emp.stream().noneMatch(en->en.getName()=="x");
System.out.printf("isNoneMatch %b",isNoneMatch);

//findAny() it will return any  value 
Employee ef=emp.stream().findAny().get();
System.out.println("findAny "+ef);

//findFirst()
System.out.println(emp.stream().findFirst().get());

//sorted() sort the data 
System.out.println(emp.stream().map(es->es.getId()).sorted().toList());
//for reverse order
// System.out.println(emp.stream().map(es->es.getId()).sorted((e1,e2)-> e1.getId()-e2.getId()).toList());

//min()
Employee emin=emp.stream().min((e1,e2)->(int) (e1.getId()-e2.getId())).get();
System.out.println(emin);


//max
Employee emax=emp.stream().max((e1,e2)->(int) (e1.getId()-e2.getId())).get();
System.out.println(emax);

//average 403
// double eavg=emp.stream().mapToDouble(ev->ev.getId()).average().get();
// System.out.println(eavg);

String str=new String("vamsi");
StringBuilder sb=new StringBuilder("vamsi");
System.out.println(str.equals(sb.toString()));
}
}