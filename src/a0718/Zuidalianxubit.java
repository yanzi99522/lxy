package a0718;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Zuidalianxubit {
    static void by(byte b){
        int count=0;
        int bb=(int)b;
        int t=0;
        String s="";
       while (bb!=0){
            t=b%2;
            s=s+t;
            bb=bb/2;
        }
        System.out.println(s);

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()) {
            byte b=in.nextByte();
            int bb=(int)b;
           String s;
            s=Integer.toBinaryString(bb);
            System.out.println(s);
            
        }
    }
}
