package a0716;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] strings=in.nextLine().split(" ");
        System.out.println(strings.length);
        for (int i=0;i<strings.length;i++){
            System.out.println(strings[i]);
        }
    }
}
