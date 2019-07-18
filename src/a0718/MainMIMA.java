package a0718;

import java.util.Scanner;

/**
 * @author lxy
 */
public class MainMIMA {
    static int getNumber(String s){
        int result=1;
        //将字符串反转
        StringBuffer stringBuffer=new StringBuffer(s);
        String temp=stringBuffer.reverse().toString();
        //获取所有子串，查看翻转后的字符串是否包含该子串
        for (int i=temp.length();i>=1;i--){
            //i是子串的长度
            for (int j=0;j<=temp.length()-i;j++){
                String tempstring=temp.substring(j,j+i);
                if (s.contains(tempstring)){
                    return i;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.next();
            System.out.println(getNumber(s));
        }



    }
}
