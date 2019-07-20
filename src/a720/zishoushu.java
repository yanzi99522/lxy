package a720;

import java.util.Scanner;

/**自守数是指一个数的平方的尾数等于该数自身的自然数。例如：25^2 = 625，76^2 = 5776，9376^2 = 87909376。
 * 请求出n以内的自守数的个数
 * @author lxy
 */
public class zishoushu {
    static int zishou(int n){
        int n2=n*n;
        if (n<10){
            if (n2%10==n){
                return 1;
            }else {
                return 0;
            }
        }else if (n<100){
            if (n2%100==n){
                return 1;
            }else {
                return 0;
            }
        }else if (n<1000){
            if (n2%1000==n){
                return 1;
            }else {
                return 0;
            }
        }else if (n<10000){
            if (n2%10000==n){
                return 1;
            }else {
                return 0;
            }
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int num=0;
            int n=in.nextInt();
            for (int i=0;i<=n;i++){
                if (zishou(i)==1){
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}
