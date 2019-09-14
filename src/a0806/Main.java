package a0806;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main {
    static String shuzi(int n){
        switch (n){
            case 1:
                System.out.print("一");;break;
            case 2:System.out.print("二") ;break;
            case 3:System.out.print("三");break;
            case 4:System.out.print("四") ;break;
            case 5:System.out.print( "五") ;break;
            case 6:System.out.print( "六") ;break;
            case 7:System.out.print( "七") ;break;
            case 8:System.out.print( "八") ;break;
            case 9:System.out.print( "九") ;break;
            default:
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        while (sin.hasNext()){
            int n=sin.nextInt();
            String string=n+"";
            int length=string.length();
            char []chars=string.toCharArray();
            switch (length){
                case 1:shuzi(n);break;
                case 2:switch (chars[0]){
                    case 1:
                        System.out.print("十"+shuzi(chars[1]));
                    case 2:   System.out.print("二十"+shuzi(chars[1]));
                    case 3:   System.out.print("三十"+shuzi(chars[1]));
                    case 4:   System.out.print("四十"+shuzi(chars[1]));
                    case 5:   System.out.print("五十"+shuzi(chars[1]));
                    case 6:   System.out.print("六十"+shuzi(chars[1]));
                    case 7:   System.out.print("七十"+shuzi(chars[1]));
                    case 8:   System.out.print("八十"+shuzi(chars[1]));
                    case 9:   System.out.print("九十"+shuzi(chars[1]));

                }
            }
        }
    }
}
