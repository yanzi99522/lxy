package aNiuKeWang;

import java.util.Scanner;

public class Fan {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        int[] rra=new int[n];
        while (in.hasNextInt()){
            for (int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            for (int j=0;j<n;j++){
                rra[j]=arr[n-1-j];
                System.out.print(rra[j]+" ");
            }
        }
    }
}
