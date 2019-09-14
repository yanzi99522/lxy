package Lianbiao;

import java.util.Scanner;

 class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(sum(in.nextInt()));
            System.out.println();
        }
        in.close();
    }
    public static int sum(int number){
        return ((1+number)*number/2);


    }
}
