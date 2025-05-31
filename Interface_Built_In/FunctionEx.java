import java.util.function.*;

class FunctionEx {
    public static void main(String[] args) {
        // Function that divides a number by 2
        Function<Integer, Double> div = e -> e / 2.0;
        System.out.println(div.apply(10)); // 5.0

        // Function that checks if age is >= 18
        Function<Integer, String> isGreater = n -> n >= 18 ? "Valid User" : "Invalid User";
        // System.out.println(isGreater.apply(18)); // Valid User


        Function<String, String> appendMessage = msg -> msg ;
        String res = isGreater.andThen(appendMessage).apply(23);
        System.out.println(res); 

//         the output "Valid User" is automatically passed to appendMessage
// → "Valid User"
     
     Function<String,Integer> c=s->s.length();
     System.out.println(isGreater.compose(c).apply("vamsixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"));

//static method
     Function<Integer,Integer> iden=Function.identity();
     System.out.println(iden.apply(34));
     
    }
}
