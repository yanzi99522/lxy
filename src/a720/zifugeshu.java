package a720;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lxy
 */
public class zifugeshu {
    public static void main(String[] args) {
        Set<Character>set=new HashSet<>();
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int j=0;
        for (int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
    }
}
