package Lianbiao;

import java.util.Scanner;
//级数求和，求1+1/2+1/3+...+1/n的和
public class Main {

    public static void main(String[] args) {
        System.out.println("请输入一个K");
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        int n,b;
        double s=1;
        for (int i=2;;i++){
            s=s+(double)1/i;
            if (s>k){
                b=i;
                break;
            }
        }

        System.out.println(b);
        System.out.println(s);

    }
}
