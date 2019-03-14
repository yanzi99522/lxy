package algorithm;

import java.util.Scanner;

public class Digui {
    static long fact(int n){//求阶乘方法
        if(n<1){
            return  1;
        }
        else {
            return n*fact(n-1);//递归
        }
    }

    public static void main(String[] args) {
        int i;//声明变量
        System.out.println("请输入要计算阶乘的一个整数：");
        Scanner input=new Scanner(System.in);
        i=input.nextInt();//输入数据
        System.out.println(i+"的阶乘结果为："+fact(i));//调用方法
    }
}
