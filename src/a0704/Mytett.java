package a0704;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Mytett {//验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
   // 例如：1^3=1 2^3=3+5 3^3=7+9+11 4^3=13+15+17+19
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int n2=n*n;
        int n3=n*n*n;
        if (n2%2==0){
            int[] oushu=new int[n];
            int z1=n/2;
            int z2=n/2;
            oushu[z1-1]=n2-1;
            oushu[z2]=n2+1;
            while (z1-1>0){
                oushu[z1-1-1]=oushu[z1-1]-2;
                oushu[z2+1]=oushu[z2]+2;
                z1--;
                z2++;
            }
            String str="";
            for (int i=0;i<n-1;i++){
                str=str+oushu[i]+"+";

            }
            System.out.println(str+oushu[n-1]);
        }else {
            int jishu[]=new int[n];
            int z1=n/2;
            int z2=n/2;
            jishu[z1]=n2;
            jishu[z2]=n2;
            while (z1>0){
                jishu[z1-1]=jishu[z1]-2;
                jishu[z2+1]=jishu[z2]+2;
                z1--;
                z2++;
            }
            String str="";
            for (int i=0;i<n-1;i++){
                str=str+jishu[i]+"+";

            }
            System.out.println(str+jishu[n-1]);
        }

    }
}
