package aaaaniu.ke.wang.main;

public class shuzupaixu {
    public static void main(String[] args) {
        int[] number={1,2,3,5,7,6,4,9};
        int n=number.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (number[i]>number[j]){
                    int t=number[i];
                    number[i]=number[j];
                    number[j]=t;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(number[i]);
        }
    }
}
