package a0701;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Duoxiangshi {
    static int hanshu(int[] a,int n,int x){
        int n1=a[n-1];
        int result=n1;
        for (int i=n-2;i>=0;i--){
            result=result*x+a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]a={1,2,3,4};
       int []x={1,2,3,4};
       for (int i=0;i<4;i++){
           int result=hanshu(a,4,x[i]);
           System.out.println(result);
       }


    }

}
