package a0706;

import java.util.Scanner;

/**
 * @author lxy
 */
public class MainONLY1 {
    static  int only(int n){
        int count=0;
        String s="";
        for (int i=0;i<=n;i++){
            s=s+i;
            int length=s.length();
            System.out.println(length);
            for (int j=0;j<length;j++){
                char a=s.charAt(j);
                System.out.println(a);
                if (a == '1') {
                    count++;
                }
            }

        }


        return count;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int result=only(n);
        System.out.println(result);
    }
}
