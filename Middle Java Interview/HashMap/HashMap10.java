import java.util.HashMap; 
import java.util.Map; 

public class TraversalTheHashMap {
    public static void main(String[] args) 
    {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Someone1", 10);
        map.put("Someone2", 20);
        map.put("Someone3", 30);
        

        for (Map.Entry<String, Integer> e: map.entrySet()) 
                System.out.println("Key: " + e.getKey()
                            + " Value: " + e.getValue()); 
    }
}