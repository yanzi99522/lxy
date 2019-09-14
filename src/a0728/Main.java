package a0728;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int qian=0,hou=0,p=0,x=0;
        while (in.next()!="\\n"){
            String s="";
            s=s+in.next();
            char[] zifu=s.toCharArray();
            int length=zifu.length;

            for (int i=0;i<length-1;i++){
                if (zifu[i]<zifu[i+1]){

                }else {
                    qian=zifu[i-1];
                    hou=zifu[i+1];
                    x=zifu[i];
                    p=i;
                }
            }

        }
        int[]houxuanb=new int[100];
        int houxuan=0;
        while (in.hasNext()){
            String shuzub="";
            shuzub=shuzub+in.next();
            char[]b=shuzub.toCharArray();
            int lengthb=b.length;
            for (int i=0;i<lengthb;i++){
                if (b[i]>qian&&b[i]<hou){
                    houxuanb[houxuan]=b[i];
                    houxuan++;
                }
            }
        }
        int max=0;
        for (int i=0;i<99;i++){
            if (houxuanb[i]>houxuanb[i+1]){
                max=houxuanb[i];
            }
        }
        if (max!=0){
            System.out.println(max);
        }else {
            System.out.println("NO");
        }
    }
}
