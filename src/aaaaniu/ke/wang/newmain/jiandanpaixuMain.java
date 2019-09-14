package aaaaniu.ke.wang.newmain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class jiandanpaixuMain {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            ArrayList list=new ArrayList();
            Set set=new HashSet();
            int[] number=new int[n];
            for (int i=0;i<n;i++){
                number[i]=in.nextInt();
                set.add(number[i]);

            }



        }
    }
}
