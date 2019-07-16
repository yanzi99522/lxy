package a0716;

import java.util.Scanner;

/**在命令行输入如下命令：
 xcopy /s c:\ d:\，
 各个参数如下：
 参数1：命令字xcopy
 参数2：字符串/s
 参数3：字符串c:\
 参数4: 字符串d:\
 请编写一个参数解析程序，实现将命令行各个参数解析出来。
 * @author lxy
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String string=in.nextLine();
        StringBuffer stringBuffer=new StringBuffer();
        int len=0;
        int quotaNum=0;
        for (int i=0;i<string.length();i++){
            if (string.charAt(i)=='\"'){
                quotaNum++;
                continue;
            }
            if (string.charAt(i)!=' '){
                stringBuffer.append(string.charAt(i));
            }else if (quotaNum%2==0){
                stringBuffer.append('\n');
                len++;
            }else {
                stringBuffer.append(' ');
            }
        }
        System.out.println(len + 1);
        System.out.println(stringBuffer.toString());
    }
}
