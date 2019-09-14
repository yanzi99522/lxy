package a731;

import java.time.LocalDate;

/**
 * @author lxy
 */
public class zuixiao {
    public static void main(String[] args) {
        int shuzu[]={356,334,32,321};
        int length=shuzu.length;
        for (int i=0;i<length;i++){
            for (int j=i;j<length;j++){
                int t=0;
                if (shuzu[i]>shuzu[j]){
                    t=shuzu[i];
                    shuzu[i]=shuzu[j];
                    shuzu[j]=t;
                }
            }
        }

        for (int i=0;i<length;i++){
            System.out.println(shuzu[i]);
        }
    }
}
