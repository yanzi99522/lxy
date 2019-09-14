package www.ke;

import java.util.Scanner;

public class dazhengshuMain {
    static int zhengchu(int n){
        int temp=0;
        for (int i=2;i<=9;i++){
            if (n%i==0){
                temp++;
                System.out.print(i+" ");
            }
            if (temp<=0){
                System.out.println("none");
            }
        }

        return temp;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            zhengchu(n);
        }
    }
}
