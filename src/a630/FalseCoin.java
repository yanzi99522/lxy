package a630;

import hank.Solution2;

import java.util.Scanner;

/**
 * @author lxy
 */
public class FalseCoin {
    static final int Maxnum=10;
    static int FalseCoin(int coin[] ,int low,int high){
        int i,sum1,sum2,sum3;
        int re=0;
        sum1=sum2=sum3=0;
        if (low+1==high){
            if (coin[low]<coin[high]){
                re=low+1;
                return re;
            }
            else {
                re=high+1;
                return re;
            }
        }

        if( (high-low+1)%2==0){
            for (i=low;i<low+(high-low+1)/2;i++){
                sum1=sum1+coin[i];
            }
            for (i=low+(high-low+1)/2;i<high;i++){
                sum2=sum2+coin[i];
            }
            if (sum1>sum2){
                re=FalseCoin(coin,low+(high-low+1)/2,high);
                return re;
            }else if (sum1<sum2){
                re=FalseCoin(coin,low,low+(high-low+1)/2);
                return re;
            }else {

            }
        }else {
            for (i=low;i<=low+(high-low+1)/2;i++){
                sum1=sum1+coin[i];
            }
            for (i=low+(high-low+1)/2;i<high;i++){
                sum2=sum2+coin[i];
            }
            sum3=coin[low+(high-low+1)/2];
            if (sum1>sum2){
                re=FalseCoin(coin,low+(high-low+1)/2,high);
                return re;
            }else if(sum1< sum2){
                re=FalseCoin(coin,low,low+(high-low+1)/2);
                return re;
            }else {

            }
            if (sum1+sum3==sum2+sum3){
                re=low+(high-low+1)/2;
                return re;
            }
        }
        return re;
    }

    public static void main(String[] args) {
        int []coin=new int[Maxnum];
        int i,n;
        int weizhi;
        System.out.println("分治算法求解假币问题：");
        System.out.println("请输入硬币的个数：");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        System.out.println("请输入硬币的真假：");
        for (i=0;i<Maxnum;i++){
            coin[i]=input.nextInt();
        }
        weizhi=FalseCoin(coin,0,n-1);
        System.out.println("在上述"+n+"个硬币中，假币在第"+weizhi);
    }
}
