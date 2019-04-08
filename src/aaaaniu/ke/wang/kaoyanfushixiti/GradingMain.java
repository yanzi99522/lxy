package aaaaniu.ke.wang.kaoyanfushixiti;

import java.util.Scanner;

public class GradingMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            double P=in.nextDouble();
            double T=in.nextDouble();
            double G1=in.nextDouble();
            double G2=in.nextDouble();
            double G3=in.nextDouble();
            double GJ=in.nextDouble();
            double G1G2=(G1-G2);
            double AG1G2=Math.abs(G1G2);
            boolean t1=AG1G2<=T;
            if (t1){
                System.out.println((G1+G2)/2);

            }else {
                if (Math.abs(G3-G1)<=T&&(Math.abs(G3-G2)<=T)){
                    System.out.println(Math.max(Math.max(G1,G2),Math.max(G3,G2)));
                }else if (Math.abs(G3-G1)>T&&(Math.abs(G3-G2)>T)){
                    System.out.println(GJ);

                }else if (Math.abs(G3-G1)>(Math.abs(G3-G2))){
                    System.out.println((G2+G3)/2);
                }else {
                    System.out.println((G1+G3)/2);
                }

            }
        }
    }
}
