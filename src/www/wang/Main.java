package www.wang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int[] number=new int[n];
            for (int i=0;i<n;i++){
                number[i]=in.nextInt();

            }
            for (int i=0;i<n;i++){
                int temp=0;
                for (int j=i+1;j<n;j++){
                    if (number[i]>number[j]){
                        temp=number[i];
                        number[i]=number[j];
                        number[j]=temp;
                    }
                }
            }
            for (int i=0;i<n;i++){
                System.out.print(number[i]+" ");

            }
        }
    }
}
