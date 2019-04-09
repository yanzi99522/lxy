package aaaaniu.ke.wang.testMAIN;

import java.util.Scanner;

public class jiajianchengchuMain {
    static long fun(int n){
        if (n==1){
            return 1;
        }else {
            return n*fun(n-1);
        }

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int a=in.nextInt();
            String operator=in.next();
            int b=0;
            if (!operator.equals("!")){
                b=in.nextInt();
            }else {
                System.out.println(fun(a));
                continue;
            }

            switch (operator){
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case"*":
                    System.out.println(a * b);
                    break;
                case"/":
                    if (b==0)
                        System.out.println("error");
                    else
                        System.out.println(a/b);
                    break;
                case"%":
                    if (b==0)
                        System.out.println("error");
                    else
                    System.out.println(a%b);
                    break;

            }
            }
        in.close();
        }
    }

