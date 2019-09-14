package aaaaniu.ke.wang.eleven;

public class duichenpingfangshuMain2 {
    public static void main(String[] args) {
        for (int i=0;i<=256;i++){
            int sum=0;
            int s=i*i;
            while (s>0){
                sum=sum*10+s%10;
                s/=10;
            }
            if (sum==i*i){
                System.out.println(i);
            }
        }
    }
}
