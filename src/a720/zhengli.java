package a720;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lxy
 */
public class zhengli {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String  s=in.nextLine();
            char[]chars=s.toCharArray();
            Arrays.sort(chars);;
            System.out.println(chars);
        }
        in.close();
    }
}
