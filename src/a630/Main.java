package a630;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int count=0;
            int temp,t=0;
            while (n>0){
                temp=n%2;
                if (temp==1){
                    count++;
                }
                n=n/2;
            }
            System.out.println(count);
        }
    }
}
