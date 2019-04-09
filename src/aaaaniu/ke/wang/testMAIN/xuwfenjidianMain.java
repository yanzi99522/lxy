package aaaaniu.ke.wang.testMAIN;

import java.util.Scanner;

public class xuwfenjidianMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double sum=0;
        while (in.hasNext()){
            int n=in.nextInt();
            int[] subject=new int[n];
            double[] sub=new double[n];
            int[] score=new int[n];
            int s1=0;
            for (int i=0;i<n;i++){
                subject[i]=in.nextInt();
                s1+=subject[i];

            }
            for (int i=0;i<n;i++){
                score[i]=in.nextInt();
                if (score[i]>=90&&score[i]<=100){
                    sub[i]=4.0;
                }
                if (score[i]>=85&&score[i]<=89){
                    sub[i]=3.7;
                }
                if (score[i]>=82&&score[i]<=84){
                    sub[i]=3.3;
                }
                if (score[i]>=78&&score[i]<=81){
                    sub[i]=3.0;
                }
                if (score[i]>=75&&score[i]<=77){
                    sub[i]=2.7;
                }
                if (score[i]>=72&&score[i]<=74){
                    sub[i]=2.3;
                }
                if (score[i]>=68&&score[i]<=71){
                    sub[i]=2.0;
                }
                if (score[i]>=64&&score[i]<=67){
                    sub[i]=1.5;
                }
                if (score[i]>=60&&score[i]<=63){
                    sub[i]=1.0;
                }
                if (score[i]<60){
                    sub[i]=0.0;
                }
            }
            for (int k=0;k<n;k++){
                double temp=subject[k]*sub[k];
                sum=sum+temp;
            }
            System.out.printf("%.2f",sum/s1);
        }
    }
}
