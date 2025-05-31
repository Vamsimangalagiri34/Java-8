import java.util.*;
import java.util.stream.Collectors;

class StreamApi{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Leo", "Mark", "Juger", "Nepali", "Hena", "Truky", "Milony");

        // Filter names whose length is >= 4
        List<String> filteredList = list.stream()
                                        .filter(s -> s.length() >= 4)
                                        .collect(Collectors.toList());

        System.out.println(filteredList);  

        // Append "M" to strings with length <= 3
        List<String> mappedList = list.stream()
            .map(s -> {
                if (s.length() <= 3) {
                    return s + "M";
                } else {
                    return s;
                }
            })
            .collect(Collectors.toList());

        System.out.println(mappedList);


    List<Integer> list2 = Arrays.asList(1,2,3,4,5);
    System.out.println(list2);

    Optional<Integer> reducerdList=list2.stream()
    .reduce((i,j)->{
        if(i<j){
            return i+j;
        }
        else{
            return i;
        }
    });

    if(reducerdList.isPresent()){
        System.out.println(reducerdList.get());
    }



    }


    
}

