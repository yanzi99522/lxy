package aaaaniu.ke.wang.newmain;

import java.util.Scanner;

public class chazhaoMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int[] number=new int[n];
            for (int i=0;i<n;i++){
                number[i]=in.nextInt();
            }
            int f=in.nextInt();
            int[] find=new int[f];
            for (int i=0;i<f;i++){
                find[i]=in.nextInt();
            }

            for (int i=0;i<f;i++){
                int flag=0;
                for (int j=0;j<n;j++){

                    if (find[i]==number[j]){
                       flag++;
                    }else {

                    }

                }
                if (flag>0){
                    System.out.println("YES");

                }else {
                    System.out.println("NO");
                }

            }

        }
    }
}
