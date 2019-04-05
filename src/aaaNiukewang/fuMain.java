package aaaNiukewang;


import java.util.Scanner;
public class fuMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();  //表示有几行
        for (int i = 0; i < a; i ++){
            int[] b = new int[4];
            for (int j = 0; j < 4; j ++){
                b[j] = input.nextInt();
            }
            System.out.println(complex(b));
        }
    }

    private static String complex(int[] b) {
        int a = b[0] + b[2];
        int c = b[1] + b[3];
        StringBuffer result = new StringBuffer();
        if (c > 0){
            result.append(a);
            result.append("+");
            result.append(c);
            result.append("i");
            return result.toString();
        }else if (c < 0){
            result.append(a);
            result.append(c);
            result.append("i");
            return result.toString();
        }else{
            result.append(a);
            return result.toString();
        }
    }
}