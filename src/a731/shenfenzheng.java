package a731;

import java.util.Scanner;

/**
 * @author lxy
 */
public class shenfenzheng {
    static int rev(int n){
        String s=n+"";
        int length=s.length();
        char[] chars=s.toCharArray();
        int n10=0;
        for (int i=0;i<length;i++){
            n10=10*n10+chars[length-1-i]-'0';
        }
        return n10;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int x=in.nextInt();
            int y=in.nextInt();
//            System.out.println(rev(x));
//            System.out.println(rev(y));
            int xy=rev(x)+rev(y);
            int yx=rev(xy);
            System.out.println(yx);
        }
    }
}
