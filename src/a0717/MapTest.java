package a0717;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author lxy
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String ,Integer>map=new HashMap<>();
        map.put("alice",1);
        map.put("bob",2);
        System.out.println(map);
        Map<String ,Integer>map1=new TreeMap<>();
        map1.put("co",2);
        map1.put("ab",3);
        map1.put("ba",1);
        System.out.println(map1);
    }
}
