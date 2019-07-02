package a0702;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Substring {//截取字符串
    static String ss;
    static int n;

    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scanner=new Scanner(System.in);
        ss=scanner.next();
        System.out.println("请输入字节数：");
        Scanner bytenum = new Scanner(System.in);
        n=bytenum.nextInt();
        Interception(SetValue());


    }

    public static  String [] SetValue(){
        String[] strings = new String[ss.length()];
        for (int i=0;i<strings.length;i++){
            strings[i]=ss.substring(i,i+1);
        }
        return strings;
    }
    public static void Interception(String []strings){
        int count=0;
        String m="[\u4e00-\u9fa5]";
        System.out.println("以每" + n + "个字节划分的字符串如下所示：");
        for (int i=0;i<strings.length;i++){
            if (strings[i].matches(m)){
                count=count+2;
            }else {
                count=count+1;
            }
            if (count<n){
                System.out.print(strings[i]);

            }else if (count==n){
                System.out.print(strings[i]);
                count=0;
                System.out.println();
            }else {
                count=0;
                System.out.println();
            }
        }
    }
}
