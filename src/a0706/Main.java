package a0706;

import Data_Structure.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author lxy
 */
public class Main {//一个字符串中可能包含a~z中的多个字符，
    // 如果有重复，求出现次数最多的那个字母及次数，如果有多个重复则都求出
    public static void main(String[] args) {
        String input="aabcvdgjueyagkdhuiagalkh";
        new Main().doString(input);
    }

    public void doString(String input){
        char[] chars=input.toCharArray();
        System.out.println("输入的字符：");
        for (int i=0;i<chars.length;i++){
            System.out.print(chars[i]+" ");
        }
        System.out.println();
        ArrayList arrayList=new ArrayList();
        TreeSet treeSet=new TreeSet();
        for (int i=0;i<chars.length;i++){
            arrayList.add(String.valueOf(chars[i]));//add在list集合的尾部添加指定的元素collections
            treeSet.add(String.valueOf(chars[i]));//add在set集合的尾部添加指定的元素collections
        }
        //set无序，不可重复
        System.out.println("treeset有序，不可重复");
        System.out.println(treeSet);
        System.out.println("arraylist可重复");
        System.out.println(arrayList);
        Collections.sort(arrayList);
        //list有序，可重复
        System.out.println("sort排序之后的arraylist"+arrayList);

        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0;i<arrayList.size();i++){//size()返回list集合中的元素数，返回值是int类型。collections
            stringBuffer.append(arrayList.get(i));//append追加stringbuffer//get返回集合中指定位置i的元素
        }

        input=stringBuffer.toString();
        System.out.println(input);
        int max=0;
        String  maxString="";
        ArrayList maxlist = new ArrayList();

        Iterator iterator = treeSet.iterator();//iterator返回迭代器对象（Iterator)，迭代器对象用于遍历集合Collections
        while (iterator.hasNext()){
            String os = (String) iterator.next();
            int begin = input.indexOf(os);//从前往后查找List集合元素，返回第一次出现os的索引
            int end=input.lastIndexOf(os);//从后往前查找list集合元素，返回第一次出现指定元素的索引
            int value=end-begin+1;
            if (value>max){
                max=value;
                maxString=os;
                maxlist.add(os);
            }else if (value==max){
                maxlist.add(os);
            }
        }

        int index=0;
        for (int i=0;i<maxlist.size();i++){
            if (maxlist.get(i).equals(maxString)){
                index=i;
                break;
            }
        }

        System.out.println("max data");
        for (int i=index;i<maxlist.size();i++){
            System.out.print(maxlist.get(i)+" ");
        }
        System.out.println();
        System.out.println("max"+max);
    }
}
