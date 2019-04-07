package atest;

import java.util.HashSet;
import java.util.Set;

public class jiheset {
    public static void main(String[] args) {
        Set set=new HashSet();
        String b="B";
        set.add("A");
        set.add("B");
        set.add(b);
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("集合size=" + set.size());
        System.out.println(set);
        for (Object item:set){
            String S=(String)item;
            System.out.println(S);
        }
    }
}
