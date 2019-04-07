package atest;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class JIHEMAP {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put(1,"a");
        map.put(2, "b");
        map.put(3, "b");
        map.put(4, "b");
        map.put(5, "b");
        map.put(5, "e");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.get(5));
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.values());
        //1.使用增强for循环遍历
        Set keys=map.keySet();
        for (Object key:keys){
            int ikey=(Integer)key;
            String VALUE=(String)map.get(ikey);
            System.out.println(ikey+VALUE);
        }
        //2.使用迭代器遍历
        Collection values=map.values();
        Iterator iterator= values.iterator();
        while (iterator.hasNext()){
            Object item=iterator.next();
            String S=(String)item;
            System.out.println(S);
        }
    }
}
