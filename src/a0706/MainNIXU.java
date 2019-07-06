package a0706;

import java.util.Scanner;

/**
 * @author lxy
 */
public class MainNIXU {//字符逆序
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String string=in.nextLine();
        //System.out.println(string);
        char [] chars=string.toCharArray();
        StringBuffer stringBuffer=new StringBuffer();
        for (int i=0;i<chars.length;i++){
            stringBuffer.append(chars[chars.length-1-i]);
        }
        System.out.println(stringBuffer);
    }
}
