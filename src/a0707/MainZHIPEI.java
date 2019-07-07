package a0707;

import java.util.Arrays;

/**
 * @author lxy
 */
public class MainZHIPEI {//在给定的数组找出出现次数超过一半的数
    static  int judge(int[] ints){
        Arrays.sort(ints);
        int count=1;
        for (int i=0;i<(ints.length-1);i++){
            if (ints[i]==ints[i+1]){
             count++;
             if (((double)count)/ints.length>0.5){
                 return i;
             }
            }else {
                count=1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] ints={3,4,4,3,3,3,3,2,1,4,3};
        int j = judge(ints);
        if (j==-1){
            System.out.println("没有！");
        }else {
            System.out.println("支配数是："+ints[j]);
        }
    }
}
