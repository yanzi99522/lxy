package aaaaniu.ke.wang.main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class simplesortingMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int[] number=new int[n];
            for (int i=0;i<n;i++){
                number[i]=in.nextInt();
            }
            for (int i=0;i<n;i++){
                for (int j=i+1;j<n;j++){
                    if (number[i]>number[j]){
                        int t=number[i];
                        number[i]=number[j];
                        number[j]=t;
                    }
                }
            }
            for (int k=0;k<n;k++) {
                if (k == n - 1) {

                        System.out.print(number[n-1]);


                } else {


                    if (number[k] != number[k + 1]) {
                        System.out.print(number[k] + " ");
                    } else {

                    }

                }
            }



//            Set set=new HashSet();
//            for (int i=0;i<n;i++){
//               set.add(number[i]);
//            }
//            for (Object item:set){
//                String s=item+"";
//                System.out.print(s+" ");
//            }
        }
    }
}
