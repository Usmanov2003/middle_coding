import java.util.HashMap; 

public class ExmapleHashMap { 
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Jim", 35);
        
        System.out.println(hashMap.get("John"));

        hashMap.remove("Jim");

        System.out.println(hashMap.containsKey("Jim"));

        System.out.println(hashMap.size());
    }
}