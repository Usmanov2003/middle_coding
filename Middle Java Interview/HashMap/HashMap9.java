import java.io.*;
import java.util.*;

class RemovedElementsOfHashMap { 

    public static void main(String args[]) 
    {
        Map<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "The");
        hm.put(2, "Word");
        hm.put(3, "For");
        hm.put(4, "Use");

        System.out.println("Mapping of HashMap are: "
                            + hm);

        hm.remove(4);

        System.out.println("Mapping after removal are: " 
                            + hm);
    }
}