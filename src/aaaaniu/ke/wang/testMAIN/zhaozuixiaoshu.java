package aaaaniu.ke.wang.testMAIN;

import java.util.Scanner;

public class zhaozuixiaoshu {
    static int mint(int a,int b){
        if (a<b){
            int te=a;
            a=b;
            b=te;
        }
        return a;
    }
    static int min(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] != 0) {
                    if (a[i] < a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }if (a[i]==a[j]){
                        mint(a[i],a[j]);
                    }
                }else {
                    i++;
                }
            }
        }
        return a[a.length - 1];
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] ab=new int[n];
        while (in.hasNext()){


            int[]b=new int[n];
            for (int i=0;i<n;i++){
               ab[i]=in.nextInt();
               b[i]=in.nextInt();
            }
            int mina=min(ab);
            int minb=1000;
            for (int i=0;i<ab.length;i++){
                int p=0;


                int[] c=new int[n];
                if (ab[i]==mina){
                    p++;

                    c[i]=b[i];
                }
                if (p>1){
                   minb=min(c);
                }else {
                    minb=b[i];
                }
            }

            System.out.println(mina+" "+minb);
        }

    }
}
