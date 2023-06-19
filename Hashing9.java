import java.util.*;
public class Hashing9 {
    
    public static boolean isAnagram(String s,String t){
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            
        }
        for (int j = 0; j < t.length(); j++) {
            if(map.get(t.charAt(j))!=null){
                if(map.get(t.charAt(j))==1){
                    map.remove(t.charAt(j));

                }
                else{
                    map.put(t.charAt(j),map.get(t.charAt(j))-1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
    
    public static void main(String args[]){

        String s="race";
        String t="care";
        System.out.println(isAnagram(s, t));
    }
    
}
