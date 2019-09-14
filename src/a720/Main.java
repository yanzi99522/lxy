package a720;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        byte bytes=in.nextByte();
        int ints=(int)bytes;
        String s=Integer.toBinaryString(ints);
        System.out.println(s);
        int count=0;
        for (int i=0;i<s.length();){
            while (i<s.length()&&s.charAt(i)!=1){
                i++;
            }
            int j=i;
            while (j<s.length()&&s.charAt(j)==1){
                j++;
                if ((j-i)>count){
                    count=j-i;

                }
            }
            i=j;
        }
        System.out.println(count);
    }
}
