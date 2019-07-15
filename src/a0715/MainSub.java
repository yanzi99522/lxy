package a0715;

import java.util.Scanner;

/**
 * @author lxy
 */
public class MainSub {//求最大重复子串abcabcabc的最大重复子串abc
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String string=in.next();
            int len=string.length();
            int ans=len-1;
            for (int i=0;ans-i>0;i++){
                if (len%(ans-i)==0&&string.charAt(0)==string.charAt(ans-i)){
                    System.out.println(string.substring(0,ans-i));


                }
            }
        }
    }
}
