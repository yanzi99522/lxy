package a0721;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.nextLine();
            String string=s.substring(2,s.length());
            char[] chars=string.toCharArray();
            int num=0;
            int temp=0;
            for (int i=0;i<chars.length;i++){
                if (chars[chars.length-1-i]>=0&&chars[chars.length-1-i]<=9){
                temp=chars[chars.length-1]*(int)Math.pow(16,i);}
                else if (chars[chars.length-1-i]>='A'&&chars[chars.length-1-i]<='Z'){
                    temp=(chars[chars.length-1-i]-55)*(int)Math.pow(16,i);
                }else {
                    temp=(chars[chars.length-1-i]-87)*(int)Math.pow(16,i);
                }
                num=num+temp;
            }
//            System.out.println(s);
//            System.out.println(string);
            System.out.println(num);
        }
    }
}
