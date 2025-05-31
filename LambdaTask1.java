import java.util.*;
class LambdaTask1{
    public static void main(String sr[]){
             List<Integer> list=Arrays.asList(1,55,67,768,4,43,0,2,4,66,90);
             list.sort((a, b) -> a - b); 
//              How it works internally:
// list.sort(...) calls the sort method of the List interface.
// The lambda (a, b) -> a - b is a shorthand for a Comparator<Integer>.
// For each pair of elements a and b in the list, the lambda returns:
// A negative number if a < b (so a comes before b)
// Zero if a == b
// A positive number if a > b (so a comes after b)
// Internally, the sort method uses this comparator to compare and order elements, typically using an efficient sorting algorithm (like TimSort in Java 8+).
// Summary:
// The lambda provides the sorting logic, and the sort method uses it to arrange the list in ascending order.


             System.out.println(list); 

            //  for reverse do ((a,b)->b-a)

            list.sort((a,b)->b-a);
            System.out.println(list);
            // ...existing code...
List<String> strList = Arrays.asList("banana", "apple", "cherry", "date");
strList.sort((a, b) -> a.compareTo(b)); // or simply strList.sort(String::compareTo);
System.out.println(strList); // [apple, banana, cherry, date]
// ...existing code...
    }
}