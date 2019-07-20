package a720;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lxy
 */
public class buchong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.nextLine();
            char[]chars=s.toCharArray();
            ArrayList<Character>arrayList=new ArrayList<>();
            for (int i=chars.length-1;i>=0;i--){
                if (!arrayList.contains(chars[i])){
                    arrayList.add(chars[i]);
                }
            }
            for (char c:arrayList){
                System.out.print(c);
            }
        }
    }
}
