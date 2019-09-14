package a0728;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lxy
 */
public class MainA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> shuzua=new ArrayList<>();
        ArrayList<Integer> shuzub=new ArrayList<>();
        while (in.next()!="\n"){
            shuzua.add(in.nextInt());
        }
        while (in.hasNext()){
            shuzub.add(in.nextInt());
        }
        System.out.println(shuzua);
        System.out.println(shuzub);
    }
}
