package a618;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main6 {
    static int max(int a,int b){

        if (a>b){
            return a;
        }else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (input.hasNext()){
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();

            int jj=a+b+c;
            int cc=a*b*c;
            int jc=a+b*c;
            int cj=a*b+c;
            int kc=(a+b)*c;
            int ck=a*(b+c);
            int z=max(max(max(jj,cc),max(jc,cj)),max(kc,ck));
            System.out.println(z);
        }
    }
}
