package a0811;

import java.util.*;

public class Main4 {
    static double xialuo(double n){
        double temp=0;
        double sum=0;
        while(n>0){
            temp=n;
            sum=sum+temp;
            n=n/2;
            sum=sum+n;
        }
        return sum;
    }
    static  double distance(double n){
        if (n==0){
            return 0;
        }else {
            return n+n/2+distance(n/2);
        }
    }
   static double calcDistance(int A, int B, int C, int D) {
        // write code here
      double sum=(xialuo(A)+xialuo(B)+xialuo(C)+xialuo(D));
//      int sum2=(int)(distance(A)+distance(B)+distance(C)+distance(D));
        return sum;
    }

    public static void main(String[] args) {
       double out= calcDistance(100,90,80,70);
       int out2=Math.round((float)out);
        System.out.println(out2);
    }
}