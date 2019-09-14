package aaaaniu.ke.wang.twelve;

import java.util.Scanner;

public class coincidenceMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s1=in.nextLine();
            String s2=in.nextLine();
            char[]ss1=s1.toCharArray();
            char[]ss2=s2.toCharArray();
            int count=0;
            for (int i=0;i<s1.length();i++){
                for (int j=0;j<s2.length();j++){
                    if (ss1[i]==ss2[j]){
//                       s1.substring(i).compareTo(s2.substring(j))
                    }
                }
            }
            System.out.println(count);

        }
    }
}
