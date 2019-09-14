package a630;

/**
 * @author lxy
 */
public class QuickSort {
    static final int SIZE=8;
    static void quickSort(int[]a,int left,int right){
        int f,t;
        int ltemp,rtemp;
        ltemp=left;
        rtemp=right;
        f=a[(left+right)/2];
        while (ltemp<rtemp){
            while (a[ltemp]<f){
                ++ltemp;
            }
            while (a[rtemp]>f){
                rtemp--;
            }
            if (ltemp<=rtemp){
                t=a[ltemp];
                a[ltemp]=a[rtemp];
                a[rtemp]=t;
                --rtemp;
                ++ltemp;
            }
        }
        if (ltemp==rtemp){
            ltemp++;
        }
        if (left<rtemp){
            quickSort(a,left,ltemp-1);
        }
        if (ltemp<right) {
            quickSort(a, rtemp + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] shuzu=new int[SIZE];
        int i;
        for (i=0;i<SIZE;i++){
            shuzu[i]=(int)(100+Math.random()*(100+1));
        }
        System.out.println("排序之前的数组为：");
        for (i=0;i<SIZE;i++){
            System.out.print(shuzu[i]+" ");
        }
        System.out.println();
        quickSort(shuzu, 0, SIZE - 1);
        System.out.println("排序之后的数组为：");
        for (i=0;i<SIZE;i++){
            System.out.print(shuzu[i]+" ");
        }
        System.out.println();
    }
}
