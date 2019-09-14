package www.ke;

import java.util.Scanner;

public class wanshu {
    static int wanhsu(int n1,int n2){
        int temp=0;
        int sum=0;
        for (int i=n1;i<=n2;i++){
            for (int k=1;k<n2;k++){
                if (i%k==0){
                    temp=k;
                    sum=sum+k;

                }
            }
            if (sum==i) {
                System.out.println(sum);
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n1=in.nextInt();
            int n2=in.nextInt();
            wanhsu(n1,n2);
        }
    }
}
