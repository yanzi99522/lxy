package aaaNiukewang.bbb;
import java.math.BigInteger;
import java.util.Scanner;

public class dashujiechengMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()) {
            BigInteger t=new BigInteger("1");
            int n=in.nextInt();
            for (int i=1;i<=n;i++){
                BigInteger c=new BigInteger(String.valueOf(i));
                t=t.multiply(c);
            }
            System.out.println(t);
        }
        in.close();

    }
}


