package Search;

import java.util.Scanner;

//折半查找（Binary Search)又称为二分查找，其要求数据序列呈线性结构，也就是经过排序的数据序列。
public class ZhebanSearch {
    static final int N=15;
    static void quickSort(int[] arr,int left,int right){//快速排序算法
        int f,t;
        int rtemp,ltemp;

        ltemp=left;
        rtemp=right;
        f=arr[(left+right)/2];//确定分界值
        while (ltemp<rtemp){
            while (arr[ltemp]<f){
                ++ltemp;
            }
            while (arr[rtemp]>f){
                --rtemp;
            }
            if (ltemp<=rtemp){
                t=arr[ltemp];
                arr[ltemp]=arr[rtemp];
                arr[rtemp]=t;
                --rtemp;
                ++ltemp;
            }
        }
        if (ltemp==rtemp){
            ltemp++;
        }

        if (left<rtemp){
            quickSort(arr,left,ltemp-1);//递归调用
        }
        if (ltemp<right){
            quickSort(arr,rtemp+1,right);//递归调用
        }
    }

    static int searchFun(int a[],int n,int x){//折半查找
        int mid,low,high;

        low=0;
        high=n-1;
        while (low<=high){
            mid=(low+high)/2;
            if (a[mid]==x){
                return mid;//找到
            }else if(a[mid]>x){
                high=mid-1;
            }else {
                low=mid+1;
            }

        }
        return -1;//没找到
    }

    public static void main(String[] args) {
        int[] shuzu=new int[N];
        int x,n,i;

        for (i=0;i<N;i++){
            shuzu[i]=(int)(100*Math.random());//产生数组
        }

        System.out.println("折半查找算法演示：");
        System.out.println("排序之前数据序列");
        for (i=0;i<N;i++){
            System.out.print(" " + shuzu[i]);//输出序列
        }
        System.out.println();
        quickSort(shuzu, 0, N - 1);//排序
        System.out.println("排序之后的数据序列：");
        for(i=0;i<N;i++){
            System.out.print(" "+shuzu[i]);//输出序列
        }
        System.out.println();
        System.out.println("请输入要查找的数：");
        Scanner input = new Scanner(System.in);
        x=input.nextInt();//输入要查找的数

        n=searchFun(shuzu,N,x);//查找

        if (n<0){
            System.out.println("没找到数据");

        }else {
            System.out.print("数据："+x+"位于数组的第"+(n+1)+"个元素处。");
        }


    }
}
