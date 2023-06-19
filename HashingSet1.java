import java.util.*;
public class HashingSet1 {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        set.add(8);
        set.add(5);
        set.add(6);
        set.add(8);
        set.add(6);
        set.add(2);
        System.out.println(set);
        if(set.contains(2)){
            System.out.println("Set contains 2");
        }
        if(set.contains(3)){
            System.out.println("Set contains 3");
        }

    }
}
