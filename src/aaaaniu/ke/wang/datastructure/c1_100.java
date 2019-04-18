package aaaaniu.ke.wang.datastructure;

public class c1_100 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=100){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
        int sum2=0;
        for (;i<101;i++){
            sum2=sum2+i;
            System.out.println(sum2);
        }

        int sum3=0;
        do {
            sum3=sum3+i;
            i++;
            System.out.println(sum3);
        }while (i<101);

    }
}
