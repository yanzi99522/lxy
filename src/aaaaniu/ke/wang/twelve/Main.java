package aaaaniu.ke.wang.twelve;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static int calculate(int m) {
        int kk;
        if(m==1||m==2||m==3){
            kk=m+1;
        }else{
           kk=calculate(m-2)+calculate(m-3);
        }

        return kk;

    }
    static String reverse(int n){
        String str=new String();
        int temp;
        while (n>0){
            temp=n%10;
            str=str+temp;
            n=n/10;
        }
        return str;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
//        String[] line = in.nextLine().split(",");
//        int m = Integer.valueOf(line[0]);
//        int k = Integer.valueOf(line[1]);;
        System.out.println("请输入要查询多少只猪：（N）");
        int m=in.nextInt();
        int  kk=calculate(m+1);
        String[]mm=new String[m+1];
        String[]re=new String[m+1];
        int[] mzhi=new int[m+1];
        String[]fanzhuan=new  String[m+1];
        System.out.println("前N只猪的编号为：");
        for(int i=1;i<m+1;i++){
            mzhi[i]=calculate(i);

            System.out.print(mzhi[i]+" ");
        }
//        System.out.println("将前n只猪的编号反转：");
        for (int i=1;i<m+1;i++){
            fanzhuan[i]=reverse(mzhi[i]);
//            System.out.print(fanzhuan[i]);
        }
        System.out.println();
        int[]fanzhuanshu=new int[m+1];
        System.out.println("前N只猪的编号反转为：");
        for (int i=1;i<m+1;i++){
            fanzhuanshu[i]=Integer.valueOf(fanzhuan[i]);
            System.out.print(fanzhuanshu[i]+" ");
        }
        int ftemp;
        for (int i=1;i<m+1;i++){
            for (int j=i+1;j<m+1;j++){
                if (fanzhuanshu[i]<fanzhuanshu[j]){
                    ftemp=fanzhuanshu[i];
                    fanzhuanshu[i]=fanzhuanshu[j];
                    fanzhuanshu[j]=ftemp;
                }
            }
        }
        System.out.println();
        System.out.println("反转之后的编号最大的是：");
        System.out.println(" "+fanzhuanshu[1]);
        int qiu= Integer.valueOf(reverse(fanzhuanshu[1]));
        for(int i=1;i<m+1;i++){
            if (qiu==mzhi[i]){
                System.out.println("第"+i+"只猪的反转数最大");
            }

        }
    }
}
