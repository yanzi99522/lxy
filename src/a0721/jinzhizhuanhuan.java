package a0721;

import java.util.Scanner;

/**
 * @author lxy
 */
public class jinzhizhuanhuan {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.nextLine();
            String string=s.substring(2,s.length());
            char[] chars=string.toCharArray();
            int num=0;
            int temp=0;
            int count=0;
            char ch;
            while (count<chars.length){
                ch=chars[chars.length-1-count];
                if (ch>='0'&&ch<='9'){
                    temp=ch-'0';
                }else if (ch>='A'&&ch<='Z'){
                    temp=ch-'A'+10;
                }else if (ch>='a'&&ch<='z'){
                    temp=ch-'a'+10;
                }else {
                    break;
                }
                num=num+temp*(int)Math.pow(16,count);
                count++;
            }

//            System.out.println(s);
//            System.out.println(string);
            System.out.println(num);
        }
    }
}
