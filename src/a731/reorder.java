package a731;

import java.util.Scanner;

/**
 * @author lxy
 */
public class reorder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] array={1,2,3,4,5,6,7};
        int length=array.length;
        int []result=new int[length];
        int []result2=new int[length];
        int j=0;
        int k=0;
        for (int i=0;i<length;i++){
            if (array[i]%2==1){
                result[j]=array[i];
                j++;
            }else {
                result2[k]=array[i];
                k++;
            }
        }
        for (int m=j;m<length;m++){
            result[m]=result2[m-j];

        }

        for (int i=0;i<length;i++){
            System.out.println(result[i]);
        }
    }
}
