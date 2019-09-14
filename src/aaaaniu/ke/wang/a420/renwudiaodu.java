package aaaaniu.ke.wang.a420;

import java.util.Scanner;

public class renwudiaodu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            String[] sn=new String[n];
            String[] task=new String[n];
            for (int i=0;i<n;i++){
                sn[i]=in.nextLine();
                System.out.println(sn[i]);
            }
            for (int i=0;i<n;i++){
                task[i]=sn[i].substring(0,5);
                System.out.println(task[i]);
            }

        }
    }
}
