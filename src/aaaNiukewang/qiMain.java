package aaaNiukewang;

import java.util.Scanner;

public class qiMain {

    static int qi(int n){
        if (n%7==0||(n%10==7)||(n/10==7)){
            return n*n;

        }else {
            return 0;
        }

    }

    static int ping(int n){
        return n*n;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i;
        int s=0;
        int sun=0;
        for (i=0;i<=n;i++){

            sun+=ping(i);

            s+= qi(i);

        }
        System.out.println(sun-s);


    }
}
