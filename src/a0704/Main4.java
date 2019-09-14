package a0704;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main4 {//2+3=5
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a=in.nextInt();
        System.out.println("请输入第二个整数：");
        int b=in.nextInt();
        System.out.println("请选择要进行的运算：+ - * / %");
        String c=in.next();
        switch (c){
            case "+":
                System.out.println(a+b);break;
            case "-":
                System.out.println(a-b);break;
            case "*":
                System.out.println(a*b);break;
            case "/":
                System.out.println(a/b);break;
            case "%":
                System.out.println(a%b);break;
                default:
                    System.out.println("你输入出错了，无法计算");
        }

    }
}
