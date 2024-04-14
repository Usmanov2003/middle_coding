import java.io.*;
import java.util.*;

class ChangeElementOfHashMap { 

    public static void main(String args[])
    {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "The");
        hm.put(2, "word");
        hm.put(3, "Use");

        System.out.println("Initial Map " + hm);

        hm.put(2, "For");

        System.out.println("Updated Map" + hm);
    }
}