// 🔹 Supplier Functional Interface – Summary
// Supplier<T> is a functional interface from Java 8.

// It does not take any input, but returns a result of type T.

// It is often used when you want to generate or supply values, like providing defaults or lazy-loading.
import java.util.function.Supplier;
class SupplierEx{
    public static void main(String ard[]){

        //  Example 1: Supplying a constant value
        Supplier<String> str=()->"vamsi".toUpperCase();
        System.out.println(str.get());


        // 🔹 Example 2: Supplying a random number
        Supplier<Double> randomSupplier = () -> Math.random();
System.out.println(randomSupplier.get());  // Output: Random number like 0.672839...

Supplier<Employee> employeeSupplier = () -> new Employee("Vamsi", 101);

        Employee emp = employeeSupplier.get();
        System.out.println(emp);



//  2. Supplying default values (e.g., fallback objects)
Supplier<Employee> defaultEmployee = () -> new Employee("Default", 0);

// Employee emp = getEmployeeFromDB().orElseGet(defaultEmployee);

//lazy intilization means 

Supplier<Employee> employeeSupplier = () -> new Employee("John", 101);

// Employee object is NOT created yet

// Only when you call get(), the Employee is created
Employee emp = employeeSupplier.get();


    }
}