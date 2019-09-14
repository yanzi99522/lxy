package aaaaniu.ke.wang.testMAIN;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zhaozuixiaoMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Map<Integer,Integer>map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            int x=in.nextInt();
            int y=in.nextInt();
            if (map.containsKey(x)&&y<map.get(x)||!map.containsKey(x)){
                map.put(x,y);
            }
            if (min>x){
                min=x;
            }
            System.out.println(min+" "+map.get(min));
            in.close();
        }
    }
}
