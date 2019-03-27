package Lianbiao;

import java.util.Scanner;

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

    }
}
