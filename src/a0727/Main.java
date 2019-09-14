package a0727;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main {
    static int heshu(int n){
        int[]xx=new int[n];
        int i=1;

        for (int k=0;k<n;k++){
         i++;
            if (i%2==0||i%3==0||i%5==0){
//                System.out.println(i);
                xx[k]=i;
            }else {
            }

        }
        return xx[n-1];
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int x=heshu(n);
            System.out.println(x);

        }
    }
}
