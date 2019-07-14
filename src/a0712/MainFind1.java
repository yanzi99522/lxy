package a0712;

import java.util.ArrayList;

/**一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * @author lxy
 */
public class MainFind1 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array==null||array.length<2){
            return;
        }
        int temp=0;
        for (int i=0;i<array.length;i++){
            temp=temp^array[i];
        }

        int indexOf1=findFirstBit(temp);
        for (int i=0;i<array.length;i++){
            if (isBit(array[i],indexOf1)){
                num1[0]^=array[i];
            }else {
                num2[0]^=array[i];
            }
        }
    }

    public int findFirstBit(int num){
        int indexBit=0;
        while (((num&1)==0)&&(indexBit)<8*4){
            num=num>>1;
            ++indexBit;
        }
        return indexBit;
    }

    public boolean isBit(int num,int indexBit){
        num=num>>indexBit;
        return (num&1)==1;
    }
    public static void main(String[] args) {

    }
}
