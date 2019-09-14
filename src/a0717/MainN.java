package a0717;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.*;

/**
 * @author lxy
 */
public class MainN {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        ArrayList<Integer>A=new ArrayList<>();
        for (int i=0;i<n;i++){
            A.add(in.nextInt());
        }
        System.out.println(A);
        int a21=A.indexOf(2);
        System.out.println(a21);
        A.sort(Integer::compareTo);
        System.out.println(A);
        int a2=A.indexOf(2);
        System.out.println(a2);
        swap(A,1,3);
        System.out.println(A);
        rotate(A,2);
        System.out.println(A);
        reverse(A);
        System.out.println(A);
        for (Integer e:A){
            System.out.println(e);
        }

    }
}

