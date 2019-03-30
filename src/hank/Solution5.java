package hank;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int B=in.nextInt();
        int H=in.nextInt();
        if(B>0&&H>0){
            int area=B*H;
            System.out.print(area);
        }else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
