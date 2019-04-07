package aaaNiukewang;

import java.util.Scanner;

public class zuidazuixiaoMain {
    static int max(int[]a){
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]<a[j]){
                    int t=a[j];
                    a[j]=a[i];
                    a[i]=a[j];
                }
            }
        }
        return a[0];
    }
    static int min(int[]a){
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]>a[j]){
                    int t=a[j];
                    a[j]=a[i];
                    a[i]=a[j];
                }
            }
        }
        return a[0];
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int [] aa=new int[a];
        for (int i=0;i<a;i++){
            aa[i]=in.nextInt();
        }
        System.out.print(max(aa)+" ");
        System.out.println(min(aa));
        for (int i=0;i<aa.length;i++){
            for (int j=i+1;j< aa.length;j++){
                if (aa[i]<aa[j]){
                    int t=aa[j];
                    aa[j]=aa[i];
                    aa[i]=aa[j];
                }
            }

        }

        for (int i=0;i<aa.length;i++){
            for (int j=i+1;j<aa.length;j++){
                if (aa[i]>aa[j]){
                    int t=aa[j];
                    aa[j]=aa[i];
                    aa[i]=aa[j];
                }
            }
        }
        System.out.println(aa[0]);

        int b=in.nextInt();
        int [] bb=new int[b];
        for (int i=0;i<b;i++){
            bb[i]=in.nextInt();
        }
        System.out.print(max(bb)+" ");
        System.out.println(min(bb));

    }
}
