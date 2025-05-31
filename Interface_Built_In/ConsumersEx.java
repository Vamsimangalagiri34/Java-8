// // In Java, a Consumer is a functional interface that represents an operation that takes a single input argument and returns no result. It's typically used for operations that have side effects, like printing to the console or modifying an object.
// ✅ Key Points:
// 🔹 Takes one input
// 🔹 Returns nothing (void)
// 🔹 Often used with lambda expressions and streams
// It is commonly used with lambda expressions and stream operations like forEach().
// In Java, a Consumer is a functional interface that represents an operation that takes a single input argument and returns no result. It's typically used for operations that have side effects, like printing to the console or modifying an object.
// accept is void and addThen is Consumer<t>
import java.util.function.*;
import java.util.*;
class ConsumersEx{
    public static void main(String sr[]){
       Consumer<String> sm = str -> { System.out.println(str); };
       
       List<String> list = Arrays.asList("vamsi", "leo", "mylies", "mophers", "nimu");

       List<String> newList = new ArrayList<>();
       Consumer<String> newAdd = e -> newList.add(e.toUpperCase());

       // Example of andThen: print the string, then add to newList
       Consumer<String> printAndAdd = sm.andThen(newAdd);

       list.forEach(printAndAdd);

       Consumer<String> smal=e->newList.add(e.toLowerCase());       
       list.forEach(smal);
       System.out.println(newList);


    }
}