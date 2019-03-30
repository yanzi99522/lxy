package hank;

import java.util.Scanner;

public class Solution6 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=0;
            sum+=a+(pow(2,0)*b);
            System.out.print(sum+" ");
            for (int j=1;j<n;j++){
                sum=sum+(b*pow(2,j));
                System.out.print(sum+" ");
            }
            System.out.println();
            sum=0;
        }
        in.close();
    }
    static int pow(int a,int b){
        if(b>0){
            return (a*pow(a,b-1));
        }else {
            return 1;
        }
    }
}
