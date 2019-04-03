package aNiuKeWang;

import java.util.Scanner;

public class BaiJi {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                for (int k=0;k<n;k++){
                    if ((5*i+3*j+(1/3)*k<=n)&&(i+j+k==100)){
                        System.out.println("x="+i+",y="+j+",z="+k);
                    }
                }
            }
        }
    }
}
