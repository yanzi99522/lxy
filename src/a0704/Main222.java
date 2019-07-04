package a0704;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main222 {//把数字按字符串逆序输出123-》321

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String string="";
        while (n!=0){
            int t=n%10;
            string=string+t;
            n=n/10;
        }
        System.out.println(string);
    }

}
