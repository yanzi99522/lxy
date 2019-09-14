package aaaaniu.ke.wang.kaoyanfushixiti;

import java.util.Scanner;

public class MicifangMain {
    static void mi(int n){
        String str="";
        int i=0;
        while (n!=0){
            str=n%2+str;

            n=n/2;

            i++;
        }
        for (int j=1;j<i;j++){
            System.out.println(i-j);
        }

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str="";
        String str2="";
        int i=0;
        while (n!=0){
            str=n%2+str;
            if (n%2==1){
                str2=i+str2;
                System.out.print(str2);
            }

            n=n/2;

            i++;
        }
        for (int j=1;j<i;j++){
            System.out.println(i-j);
        }

        }


    }

