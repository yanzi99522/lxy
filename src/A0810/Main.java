package A0810;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main {
    static long minx(long[]a,int n){
        int p=0;
        long p0=(long)Math.pow(2,62);
        for (int i=0;i<n;i++){
            if (a[i]<p0){
                p0=a[i];
                p=i;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long[]shuzi=new long[n];
        while (in.hasNext()){
            for (int i=0;i<n;i++){
                shuzi[i]=in.nextLong();
            }
            long[]chazhi=new long[n-1];
            for (int i=0;i<n-2;i++){
                chazhi[i]=Math.abs(shuzi[i+1]-shuzi[i]);
            }
            chazhi[n-2]=Math.abs(shuzi[n-2]-shuzi[n-1]);
            long weizhi=minx(chazhi,n-1);
            System.out.println(shuzi[(int)weizhi]+" "+shuzi[(int)weizhi+1]);

        }
    }
}
