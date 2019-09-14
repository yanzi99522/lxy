package a0728;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Erjinzhi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int m=in.nextInt();
            int n=in.nextInt();
            String m2=Integer.toBinaryString(m);
            String n2=Integer.toBinaryString(n);
            int lm=m2.length();
            int ln=n2.length();
            int num=0;
            for (int i=0;i<lm;i++){
               if (m2.charAt(lm-1-i)!=n2.charAt(ln-1-i)){
                   num++;
               }
            }
            System.out.println(num+1);

        }
    }
}
