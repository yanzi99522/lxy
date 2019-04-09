package aaaaniu.ke.wang;

import java.util.Arrays;
import java.util.Scanner;

public class skewMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char[] chars=new char[26];
        for (int i=0;i<26;i++){
            chars[i]=(char)('A'+i);
//            System.out.println(chars[i]);
        }
        int[] times=new int[26];
        Arrays.fill(times,0);
            String str=in.next();
            for (int i=0;i<str.length();i++){
                    if (Character.isUpperCase(str.charAt(i))){
                       times[str.charAt(i)-'A']++;
                }

            }
            for (int i=0;i<26;i++){
                System.out.println(chars[i]+":"+times[i]);
            }
        }


    }

