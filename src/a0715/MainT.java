package a0715;

import java.util.Scanner;

/**
 * @author lxy
 */
public class MainT {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if (n>=0){
            StringBuilder stringBuilder=new StringBuilder();
            for (int i=0;i<n;i++){
                stringBuilder.append(in.nextInt());
            }
            findNoNumber(stringBuilder.toString());
        }
    }

    private static void findNoNumber(String s){
        if (s == null || s.length() == 0) {
            return;
        }
        for (int i=0;i<s.length();i++){
            if (!s.contains(" "+" ")){
                System.out.println(i);
                return;
            }
        }
    }
}
