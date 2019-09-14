package a731;

import java.util.*;

/**
 * @author lxy
 */
public class dayu12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String string=in.nextLine();
        String[] temp=string.split(" ");
        int count=0;
        int length=string.length();
        int middle=(int)Math.floor(length/2);
        for (int i=0;i<length-1;i++){
            if (temp[i]==temp[i++]){
                count++;
            }
            if (count>=middle){
                System.out.println(temp[i]);
            }
        }
    }
}
