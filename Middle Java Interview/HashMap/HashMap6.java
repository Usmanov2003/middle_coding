import java.io.*;
import java.util.*; 

class AddElementsToHashMap {
    public static void main(String args[]) 
    {
        Map<Integer, String> hm1 = new HashMap<>();

        hm1.put(1, "one");
        hm1.put(1, "one");
        hm1.put(1, "one");
        
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(hm1); 

        System.out.println("Mapping of HashMap hm1 are: "
                            + hm1);

        System.out.prinltn("Mapping of HashMap hm2 are: " 
                            + hm2);
    }
}