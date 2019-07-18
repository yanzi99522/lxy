package a0718;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Zifuchuan {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String  s=in.nextLine();
            String[]strings=s.split(" ");
            int len=strings.length;
            String last=strings[len-1];
            System.out.println(last.length());
        }

    }
}
