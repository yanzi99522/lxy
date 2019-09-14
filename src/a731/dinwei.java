package a731;

import java.util.Scanner;

/**
 * @author lxy
 */
public class dinwei {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            for (int i=1;;i++){
                if (n<=i*(i+1)/2){
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
