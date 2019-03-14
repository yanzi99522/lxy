package algorithm;

import java.util.Scanner;
//分治算法求解假币问题
public class Fenzhi {
    static final int MAXNUM=30;
    static int FalseCoin(int coin[],int low,int high){
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
                return  re;
            }
        }
    if ((high-low+1)%2==0){//n是偶数
        for (i=low;i<low+(high-low)/2;i++){
            sum1=sum1+coin[i];//前半段和
        }
        for (i=low+(high-low)/2;i<=high;i++){
            sum2=sum2+coin[i];//后半段和
        }
        if (sum1>sum2){
            re=FalseCoin(coin,low+(high-low)/2,high);
            return re;
        }
        else if (sum1<sum2){
            re=FalseCoin(coin,low,low+(high-low)/2);
            return re;
        }
        else {
    }
    }
    else {
        for (i=low;i<=low+(high-low)/2-1;i++){
            sum1=sum1+coin[i];//前半段和
        }
        for (i=low+(high-low)/2+1;i<=high;i++){
            sum2=sum2+coin[i];//后半段和
        }
        sum3=coin[low+(high-low)/2];
        if (sum1>sum2){
            re=FalseCoin(coin,low+(high-low)/2,high);
            return re;
        }
        else if (sum1<sum2){
            re=FalseCoin(coin,low,low+(high-low)/2-1);
            return re;
        }
        else {
        }
        if (sum1+sum3==sum2+sum3){
            re=low+(high-low)/2+1;
            return re;
        }
    }
    return re;
    }

    public static void main(String[] args) {
        int[] coin=new int[MAXNUM];
        int i,n;
        int weizhi;
        System.out.println("分治法求解假币问题：");
        System.out.println("请输入硬币总的个数：");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        System.out.println("请输入硬币的真假");

        for (i=0;i<n;i++){
            coin[i]=input.nextInt();//输入硬币的个数
        }
        weizhi=FalseCoin(coin,0,n-1);//求解
        System.out.println("在上述"+MAXNUM+"个硬币中，第"+weizhi+"个硬币是假的！");
    }
}
