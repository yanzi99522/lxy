package aaaaniu.ke.wang.kaoyanfushixiti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String string=in.nextLine();

            int[] arr=new int[3];
            for (int i=0;i<string.length();i++){
                if (string.charAt(i)=='Z'){
                    arr[0]++;
                }
                if (string.charAt(i)=='O'){
                    arr[1]++;
                }
                if (string.charAt(i)=='J'){
                    arr[2]++;
                }
            }

            StringBuffer stringBuffer=new StringBuffer();
            while (arr[0]>0||arr[1]>0||arr[2]>0){
                if (arr[0]>0){
                    stringBuffer.append("Z");
                }
                if (arr[1]>0){
                    stringBuffer.append("O");
                }
                if (arr[2]>0){
                    stringBuffer.append("J");
                }
                arr[0]--;
                arr[1]--;
                arr[2]--;
            }
            System.out.println(stringBuffer.toString());
        }
    }
}
