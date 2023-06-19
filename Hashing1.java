import java.util.HashMap;
public class Hashing1 {
    public static void main(String args[]){

    
    //Create
    //Hash maps are unordered
    HashMap<String,Integer> hm=new HashMap<>();
    hm.put("China", 300);
    hm.put("India", 230);
    hm.put("Usa", 50);
    System.out.println(hm);

    //Get O(1)
    int population_India=hm.get("India");
    System.out.println(population_India);
    
    //null value
    System.out.println(hm.get("NEpal"));

    //ContainsKey--TO check whether value exists or not in the hash table

    System.out.println(hm.containsKey("India"));
    System.out.println(hm.containsKey("Nepal"));

    //Remove
    System.out.println(hm.remove("China"));
    System.out.println(hm);

    //Size
    System.out.println(hm.size());
    System.out.println(hm.isEmpty());
    hm.clear();
    System.out.println(hm);
}
}