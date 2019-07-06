package a0706;

import java.util.Scanner;

/**
 * @author lxy
 */
public class MainDAXIE {
    static int da(String s){
        int count=0;
        char []chars=s.toCharArray();
        int len=chars.length;
        for (int i=0;i<len;i++){
            if (chars[i]>='A'&&chars[i]<='Z'){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int num=da(s);
        System.out.println(num);
    }
}
