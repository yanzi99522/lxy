package a731;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String string=in.nextLine();
            char[]chars=string.toCharArray();
            int length=string.length();
            int flag=0;
           if (string.equals("")||string.length()==0){
               flag=0;
           }
           int fuhao=0;
           if (chars[0]=='-'){
               fuhao=1;
           }
           int sum=0;
           for (int i=0;i<length;i++){
               if (chars[i]=='+'){
                   continue;
               }
               if (chars[i]<'0'||chars[i]>'9'){
                   flag=0;
               }
               sum=sum*10+chars[i]-'0';
           }
           if (flag==0){
               System.out.println("0");
           }else {
               if (fuhao == 0) {
                   System.out.println(sum);
               } else {
                   System.out.println(sum * (-1));
               }
           }
        }
    }
}

