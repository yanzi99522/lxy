package a0718;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Dengchashulie{//等差数列
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
       while (in.hasNext()){
           int n=in.nextInt();
           if (n<1){
               System.out.println(-1);
           }else {
               System.out.println(((3*n+1)*n)/2);
           }
       }
       in.close();

    }

}

