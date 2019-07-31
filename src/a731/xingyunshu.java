package a731;

import java.util.Scanner;

/**
 * @author lxy
 */
public class xingyunshu {
    static int xingyun(int n){
        int a,b,c,d,e;
        a=n%10;
        b=(n/10)%10;
        c=(n/100)%10;
        d=(n/1000)%10;
        e=(n/10000)%10;
        int sum2=a+b+c+d+e;
        String s=Integer.toBinaryString(n);
        char[]cs=s.toCharArray();
        int sum=0;
        for (int i=0;i<cs.length;i++){
            sum=sum+cs[i]-'0';
        }
        if (sum==sum2){
            return 1;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int num=0;
            for (int i=1;i<=n;i++){
                if (xingyun(i)==1){
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}
