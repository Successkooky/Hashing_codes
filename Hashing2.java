import java.util.*;
public class Hashing2 {
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India", 500);
        hm.put("Nepal", 150);
        hm.put("Canada", 400);
        hm.put("Usa", 200);
        hm.put("China", 700);
        hm.put("Indonesia", 300);

        //Iterate
        Set<String> keys=hm.keySet();
        System.out.println(keys);
        for (String string : keys) {
            System.out.println("key="+string+",value="+hm.get(string));
            
        }
    }
    
}
