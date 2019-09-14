package aaaaniu.ke.wang.kaoyanfushixiti;

import java.util.ArrayList;
import java.util.Scanner;

public class ZIFUCHUANlianjieMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.nextLine();
            char[] chars=new char[s.length()];
            ArrayList list=new ArrayList();
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)!=' '){
                    list.add(s.charAt(i));
                }
            }
            for (int i=0;i<list.size();i++){
                System.out.print(list.get(i));
            }
        }
    }
}
