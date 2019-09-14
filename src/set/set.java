package set;

import java.util.ArrayList;
import java.util.List;

public class set {
    public static void main(String[] args) {
        List list=new ArrayList();
        String b="B";

        list.add('A');
        list.add('C');
        list.add(b);
        list.add('d');
        System.out.println("集合size:"+list.size());
        System.out.println(list);
        System.out.println("indexOf (\"B\")="+list.indexOf('B'));
    }
}
