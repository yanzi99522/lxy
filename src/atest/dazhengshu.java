package atest;

import java.math.BigInteger;

public class dazhengshu {
    public static void main(String[] args) {
        BigInteger n1=new BigInteger("9999999999");
        BigInteger n2=new BigInteger("764367",16);
        System.out.println(n1.add(n2));
        System.out.println(n1.subtract(n2));
        System.out.println(n1.multiply(n2));
        System.out.println(n1.divide(n2));
    }
}
