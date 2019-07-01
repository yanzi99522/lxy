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
        int[]a=new int[4];
       a[0]=1;a[1]=1;a[2]=1;a[3]=1;
       int x=2;
       int result=hanshu(a,4,x);
        System.out.println(result);

    }

}
