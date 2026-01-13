import java.util.HashMap;

public class Main {
    static void main(String[] args) {
//      hashmap : <key, val> pair -> keys are unique, first one is key

        HashMap<String, Double> map = new HashMap<>();
        map.put("wasi", 0.05);
        map.put("kel", 9999.99);
        System.out.println(map);
        map.put("kel", 999.99);

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println(map.containsKey("wasi"));
        System.out.println(map);
        map.remove("wasi");
        System.out.println(map);
        System.out.println(map.get("kel"));
        System.out.println(map.containsKey("wasi"));
        System.out.println(map.containsValue("125"));
        System.out.println(map.size());

    }
}


