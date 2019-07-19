package a0718;

/**
 * @author lxy
 */
import java.util.Scanner;

/**
 * @author lxy
 */
public class MainT {
    static int tuzi(int n){
        if (n==1||n==2){
            return 1;
        }else {
            return tuzi(n-1)+tuzi(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {


            int n = in.nextInt();
            int num = tuzi(n);
            System.out.println(num);
        }
    }
}

