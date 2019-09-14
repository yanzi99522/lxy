package a720;

import java.util.Scanner;

/**
 * @author lxy
 */
public class zifugeshutongji {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.nextLine();
            int len=s.length();
            int num=0;
            for (int i=0;i<len;i++){
                if (s.charAt(i)>=0&&s.charAt(i)<=127){
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}
