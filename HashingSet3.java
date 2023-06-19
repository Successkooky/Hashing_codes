import java.util.*;
public class HashingSet3 {

    public static void main(String args[]){
        HashSet<String> city=new HashSet<>();
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Noida");
        city.add("Bengaluru");
        System.out.println(city);
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
         lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);
         TreeSet<String> ths=new TreeSet<>();
         ths.add("Delhi");
        ths.add("Mumbai");
        ths.add("Noida");
        ths.add("Bengaluru");
        System.out.println(ths);
    }
    
}
