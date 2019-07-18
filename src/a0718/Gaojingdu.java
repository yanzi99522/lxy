package a0718;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author lxy
 */
public class Gaojingdu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s1=in.next();
            String s2=in.next();
            BigInteger bigInteger1=new BigInteger(s1);
            BigInteger bigInteger2=new BigInteger(s2);
            System.out.println(bigInteger1.add(bigInteger2));
        }
    }
}
