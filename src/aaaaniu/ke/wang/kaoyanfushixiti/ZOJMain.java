package aaaaniu.ke.wang.kaoyanfushixiti;

import java.util.Scanner;

public class ZOJMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();

        String[] zoj=new String[str.length()];
             for (int i=0;i<str.length();i++){
                 zoj[i]=str.substring(i,i+1);
                 System.out.println(zoj[i]);
             }
             int j=0;
             for (int i=0;i<str.length();i++){
                 if (zoj[i].equals("Z")){
                     System.out.println();
                 }
             }

    }
}
