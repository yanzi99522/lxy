package a0718;

import java.util.Scanner;

/**
 * @author lxy
 */
public class ANzijie {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.next();
            int n=in.nextInt();
            StringBuffer stringBuffer=new StringBuffer();
            for (int i=0,len=0;i<s.length()&&len<n;i++){
                char c=s.charAt(i);
                if ((int)c>255){
                    if ((len+2)>n){
                        break;
                    }
                    len+=2;
                    stringBuffer.append(c);
                }
                if ((int)c>=0&&(int)c<=255){
                    len++;
                    stringBuffer.append(c);
                }

            }
            System.out.println(stringBuffer.toString());
        }
        in.close();
    }
}
