package a630;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0;

                a=n/5;
                b=n%5;
                c=b/4;
                d=b%4;
                e=d/3;
                f=d%3;
                g=f/2;
                h=f%2;



            System.out.println(a+c+e+g+h);
        }
    }
}
