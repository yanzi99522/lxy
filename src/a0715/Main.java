package a0715;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String string=in.next();
            int ans=string.length()-1;
            for (int i=0;ans>0;ans--){
                for (i=0;string.length()%ans==0&&i<string.length()&&string.charAt(i)==string.charAt(i%ans);i++){
                    if (i==string.length()){
                        break;
                    }
//                    System.out.println(ans!=0?string.substring(0,ans):"false");
                }
//                System.out.println(ans!=0?string.substring(0,ans):"false");
            }
            System.out.println(ans!=0?string.substring(0,ans):"false");
        }
    }
}
