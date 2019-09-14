package a0727;

import java.util.Scanner;

/**
 * @author lxy
 */
public class zhishu {
    static boolean prime(int n){
        int m=2;
        boolean p=false;
        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                p=true;
            }
        }
      return p;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            boolean b=prime(n);
            if (b){
                System.out.println(n+"不是质数");
            }else {
                System.out.println(n+"是质数");
            }
        }
    }
}
