import java.util.HashSet;

public class Hashing6 {
    //Find whether array is subset of another array
    
    public static boolean isSubset(int arr1[],int arr2[]){
        HashSet<Integer> hset=new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            if(!hset.contains(arr1[i]))
            hset.add(arr1[i]);
            
        }
         for (int i = 0; i < arr2.length; i++) {
            if(!hset.contains(arr2[i]))
            return false;
            
        }
        return true;

    }
    
    
    
    
    public static void main(String args[]){
        int arr1[]={11,1,13,21,3,7};
        int arr2[]={11,3,7,1};
        if(isSubset(arr1, arr2)){
            System.out.println("They are subsets");
        }
        else{
            System.out.println("Not subsets");
        }

    }
}
