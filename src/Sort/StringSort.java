package Sort;

import java.util.Scanner;
//对字符进行排序
//输入参数a一般为一个字符数组的首地址，输入参数left指向数组最左边的值，输入参数right指向数组最右边的值
public class StringSort {
    static void kuaiSu(char[] a,int left,int right){//字符快速排序
        int f,l,r;
        char t;

        l=left;
        r=right;
        f=a[(left+right)/2];
        while (l<r){
            while (a[l]<f) ++l;
            while (a[r]>f) --r;
            if (l<=r){
                t=a[l];
                a[l]=a[r];
                a[r]=t;
                ++l;
                --r;
            }
        }
        if (l==r)
            l++;
        if (left<r){
            kuaiSu(a,left,l-1);//递归调用
        }
        if (l<right){
            kuaiSu(a,r+1,right);//递归调用
        }
    }
//主函数main（）首先定义一个字符数组，输入一个字符串
    //然后，输出排序前的字符数组内容
    //调用修改的kuaisu()排序法的子方法，接着输出排序后的字符数组内容
    public static void main(String[] args) {
        char[] str=new char[80];
        int N;

        System.out.println("输入一个字符串：");
        Scanner input=new Scanner(System.in);
        str=input.next().toCharArray();//输入字符串

        N=str.length;
        System.out.println("排序前：");
        System.out.println(str);//输出

        kuaiSu(str,0,N-1);//排序

        System.out.println("排序后：");
        System.out.println(str);//输出
    }
}
