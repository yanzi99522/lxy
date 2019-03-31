package aNiuKeWang;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        while (in.hasNextInt()){
            int []b=new int[6];
            int sum=0;
            for (int i=0;i<6;i++){
                b[i]=in.nextInt();
            }
            for (int j=1;j<6;j++){
                if(b[j]<b[0]){
                    sum=sum+b[j];
                }
            }
            System.out.println(sum);
        }
        in.close();
    }
}
