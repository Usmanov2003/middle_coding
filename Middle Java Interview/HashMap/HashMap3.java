import java.io.*; 
import java.util.*; 

class GFG { 

    public static void main(String args[])
    {
        HashMap<Integer, String> hm1 = new hashMap<>();

        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");
        
        hm2.put(1, "four");
        hm2.put(1, "five");
        hm2.put(1, "six");

        System.out.println("Mapping of HashMap hm1 are: " 
                            + hm1);

        System.out.println("Mapping of HashMap hm2 are: " 
                             hm2);
    }
}