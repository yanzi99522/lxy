package aaaNiukewang.bbb;

import java.util.Scanner;

public class jioushuMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        int j=0;
        int ou=0;
        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        for (int i=0;i<n;i++){
            if (arr[i]%2==0){
                ou++;
            }else {
                j++;
            }
        }
        if (ou>j){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
