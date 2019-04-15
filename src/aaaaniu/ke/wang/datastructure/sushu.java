package aaaaniu.ke.wang.datastructure;

public class sushu {
    public static void main(String[] args) {
        int iCount=0;
        boolean isprime;
        for (int i=3;i<=100;i++){
            isprime=true;
            for (int j=2;j<=i/2;j++){
                if (i%j==0){
                    isprime=false;
                    break;
                }
            }
            if (isprime){
                System.out.print(i + "\t");
                iCount++;
                if (iCount%6==0){
                    System.out.println();
                }
            }
        }

    }
}
