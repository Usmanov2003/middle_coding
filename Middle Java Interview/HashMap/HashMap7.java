import java.io.*; 
import java.util.*;

class AddElementsToHashMap { 

    public static void main(String args[]) 
    {
        HashMap<Integer, String> hm1 = new HashMap<>();

        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

        hm1.put(1, "The");
        hm1.put(2, "For");
        hm1.put(1, "Use");
        
        hm2.put(1, "The");
        hm2.put(2, "For");
        hm2.put(3, "Use");
        

        System.out.println("Mapping of HashMap hm1 are: " 
                            + hm1);
                    
        System.out.println("Mapping of hashMap of hm2 are: " 
                            + hm2);
    }
}