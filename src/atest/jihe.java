package atest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class jihe {
    public static void main(String[] args) {
        List list=new ArrayList();
        String b="B";
        list.add("A");
        list.add("B");
        list.add(b);
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("集合size=" + list.size());
        System.out.println(list);
        System.out.println("indexOf(\"B\")=" + list.indexOf(b));
        System.out.println("lastIndexOf(\"B\")="+list.lastIndexOf(b));
        list.remove(b);
        System.out.println(list);
        System.out.println("集合是空的：" + list.isEmpty());
        list.set(1,"F");
        System.out.println(list);
//        list.add(1);
        System.out.println(list);
        //1.使用for循环遍历
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        //2、使用增强for循环遍历
        for (Object item:list){
            String s=(String)item;
            System.out.print(s);
        }
        //3.使用迭代器遍历
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            Object item=iterator.next();
            String s=(String)item;
            System.out.println(s);
        }
    }
}
