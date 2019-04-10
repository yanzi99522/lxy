package aaaaniu.ke.wang.main;

import java.util.Scanner;

public class maifangziMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int N=in.nextInt();
            int K=in.nextInt();
            int temp=0;
            int i;
            for (i=2;i<22;i++){
                if (i*N>=200*Math.pow((1+0.01*K),i-1)){
                    temp++;
                    break;
                }else {
//                    System.out.println("Impossible");
                }
            }
            if (temp>0){
                System.out.println(i);
            }else {
                System.out.println("Impossible");
            }
        }
    }
}
