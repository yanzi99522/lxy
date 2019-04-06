package aaaaniu.ke.wang;

import java.util.Scanner;

public class pingfangyinziMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i=2;i<n;i++){
            if (n%(i*i)==0){
                System.out.println("Yes");
                break;
            }else {

            }
        }
    }
}
