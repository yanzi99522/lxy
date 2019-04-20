package aaaaniu.ke.wang.a420;

import java.util.Scanner;
//每个用例首先包含2个整数n（0<n<=100000）和m(0<m<=10)，
//        其中: n为镇上的人数，m为需要找出的大富翁数,
//        接下来一行输入镇上n个人的财富值.
public class xunzhaodafuweng {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int f=in.nextInt();
            int[] nn=new int[n];
            for (int i=0;i<n;i++){
                nn[i]=in.nextInt();
            }

            if (n<f){
                for (int i=0;i<n;i++){
                    System.out.print(nn[i]+" ");
                }
            }else {
                for (int i = 0; i < f; i++) {
                    System.out.print(nn[i] + " ");
                }
            }
        }
    }
}
