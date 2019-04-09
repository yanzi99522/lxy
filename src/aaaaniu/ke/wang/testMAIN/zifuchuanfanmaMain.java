package aaaaniu.ke.wang.testMAIN;

import java.util.Scanner;

public class zifuchuanfanmaMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String str=in.next();
            char[] chars=new char[str.length()];
            for (int i=0;i<str.length();i++){
                chars[i]=str.charAt(i);
                if (chars[i]>='a'&&chars[i]<='z'){
                    chars[i]=(char)('z'-chars[i]+'a');

                }else if (chars[i]>='A'&&chars[i]<='Z'){
                    chars[i]=(char)('Z'-chars[i]+'A');
                }else {

                }
            }
            for (int j=0;j<str.length();j++){
                System.out.print(chars[j]);
            }
        }
    }
}
