package aaaaniu.ke.wang.twelve;

import java.util.Scanner;

public class primenumber {
    static char sushu(int n){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(2);
        stringBuffer.append(3);
        int temp=0;
        int t=2;
        boolean flag=false;

        for (int i=3;i<10000;i++){

            do {
                flag=i%t==0?false:true;
                t++;
            }while (t<Math.sqrt(i));
            if (flag){
                stringBuffer.append(i);
            }

        }



       return stringBuffer.charAt(n);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            System.out.println();


        }
    }
}
