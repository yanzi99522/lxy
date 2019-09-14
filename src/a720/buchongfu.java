package a720;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lxy
 */
public class buchongfu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            String s=n+"";
            int len=s.length();
            Set<Character>set=new HashSet();
            for (int i=0;i<len;i++){
                set.add(s.charAt(len-1-i));
            }
            System.out.println(set);
            for (Character character:set){
                System.out.print(character);
            }
        }
    }
}
