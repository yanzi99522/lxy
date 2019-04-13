package www.ke;

import java.util.Scanner;

public class Main {
    static int zhengchu(int n,int a){
        int k=-1;
        int nn=1;
        int temp=0;
        for (int i=1;i<=n;i++){
            temp=i;
            nn=temp*i;
        }
        System.out.println(nn);
        do {
            k++;
        }while (nn%Math.pow(a,k)==0);
        System.out.println(k);
        return k;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int a=in.nextInt();
            zhengchu(n,a);
            int k=zhengchu(n,a);
            System.out.println(k);
        }
    }
}
