package a618;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int mina=1000,minb=1000,t=0;
        while (in.hasNext()) {
            for (int i=0;i<n;i++){
                int x=in.nextInt();
                int y=in.nextInt();
                if (x<mina){
                    mina=x;
                    minb=y;
                }if (x==mina){
                    if (y<minb){
                        minb=y;
                    }
                }
            }
        }
        System.out.println(mina+" "+minb);




    }
}
