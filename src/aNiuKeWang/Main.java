package aNiuKeWang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int a1=in.nextInt();
        int a2=in.nextInt();
        int a3=in.nextInt();
        int a4=in.nextInt();
        int a5=in.nextInt();
        if (a1<a){
            int s=a1;
            if (a2<a){
                s=s+a2;
                if (a3<a){
                    s=s+a3;
                    if (a4<a){
                        s=s+a4;
                        if (a5<a){
                            s=s+a5;
                            System.out.println(s);
                        }
                    }
                }
            }
        }
        if (a1>a){
            int s=0;
            if (a2<a){
                s=s+a2;
                if (a3<a){
                    s=s+a3;
                    if (a4<a){
                        s=s+a4;
                        if (a5<a){
                            s=s+a5;
                            System.out.println(s);
                        }
                    }
                }
            }else {
                s=0;
                if (a3<a){
                    s=s+a3;
                    if (a4<a){
                        s=s+a4;
                        if (a5<a){
                            s=s+a5;
                            System.out.println(s);
                        }
                    }
                }else {
                    s=0;
                    if (a4<a){
                        s=s+a4;
                        if (a5<a){
                            s=s+a5;
                            System.out.println(s);
                        }
                    }
                    else {
                        s=0;
                        if (a5<a){
                            s=s+a5;
                            System.out.println(s);
                        }else {
                            return;
                        }
                    }
                }
            }
        }


    }
}
