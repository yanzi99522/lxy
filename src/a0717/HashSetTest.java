package a0717;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author lxy
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set<String >set=new HashSet<>();
        set.add("amsu");
        set.add("dam");
        set.add("bonb");
        if (set.contains("amu")){
            System.out.println("has amu");
        }
        System.out.println(set);
        Set<String >set1=new TreeSet<>();
        set1.add("dam");
        set1.add("bob");
        set1.add("a");
        System.out.println(set1);
    }
}
