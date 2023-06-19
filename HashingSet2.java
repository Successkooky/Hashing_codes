import java.util.*;

public class HashingSet2 {
    //Iteration over hashset
    public static void main(String args[]){
        HashSet<String> city=new HashSet<>();
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Noida");
        city.add("Bengaluru");
        // Iterator it=city.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        
        for (String ct : city) {
            System.out.println(ct);
            
        }
        }
        
    }
    

