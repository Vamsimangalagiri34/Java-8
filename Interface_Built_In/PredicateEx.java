
// // A Predicate in Java is a functional interface that represents a single argument function that returns a boolean value (true or false). It is often used for filtering or matching conditions.
// We use Predicate instead of our own custom methods because:

// Standardization: Predicate is a standard functional interface in Java, making code more readable and consistent.
// Reusability: Predicates can be easily reused and combined (and, or, negate) for complex conditions.
// Functional Programming: Predicates work seamlessly with Java Streams and other functional APIs.
// Less Boilerplate: Using Predicate with lambdas reduces the need for extra classes or methods.
// Interoperability: Many Java library methods accept Predicate, enabling powerful filtering and matching operations.
// In summary:
// Predicate makes your code cleaner, more flexible, and compatible with Java’s functional features.

import java.util.function.*;
class PredicateEx{
   public static void main(String sr[]){
    
    Predicate<Integer> isAbove=id->id>34;
    System.out.println(isAbove.test(35)); 

      Employee e=new Employee(38,"vamsi");
      Predicate<Employee> nameHas=e1->e1.getName().equals("vamsi");
      System.out.println(nameHas.test(e));

// Predicate interface, the methods .and(), .or(), and .negate() are default methods that allow you to combine or modify predicates easily.
      // .and() method
      
      Predicate<Employee> isValidId=e2->e2.getId()>10;
      Predicate<Employee> isValidName=e3->e3.getName().equals("Vamsi");
      System.out.println(isValidId.and(isValidName).test(e));

      // .or()

      Predicate<Employee> isValidId2=e4->e4.getId()>34;
      Predicate<Employee> isValidName2=e4->e4.getName().equals("vamsi");
      System.out.println(isValidId2.or(isValidName2).test(e));

     //.negate() method

     Predicate<Employee> isValidId3=e5->e5.getId()>30;
     System.out.println(isValidId3.negate().test(e));

     //.isEqual()
// In Java, .isEqual() is a static method in the Predicate interface. It returns a predicate that tests if two arguments are equal, using Objects.equals() under the hood.
// ✅ When to Use:
// Use .isEqual() when you want a concise way to create a predicate that checks equality with a specific value.
Employee k=new Employee(34,"gopi");
      Predicate<Employee> equl=Predicate.isEqual(k);
      System.out.println(equl.test(k));

   }
}

// These methods make your code more functional and clean, especially when working with Streams and filters.