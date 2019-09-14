package a0716;

import java.util.Scanner;

/**计算整数二进制中1的个数
 * @author lxy
 */
public class Mian22 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s="";
        int num=0;
        int t=0;
       do{
            t=n%2;
            s=s+t;
            n=n/2;
        }while (n!=0);
//        System.out.println(s);
        int l=s.length();
        for (int i=0;i<l;i++){
            if (s.charAt(i)=='1'){
                ++num;
            }
        }
        System.out.println(num);

    }
}
