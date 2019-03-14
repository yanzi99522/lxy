package Sort;
//冒泡排序
public class BubbleSort {
    static final int SIZE=10;
    public static void bubbleSort(int [] a){
        int temp;
        for (int i=1;i<a.length;i++){
            for (int j=0;j<a.length-i;j++){
               if(a[j]>a[j+1]){//将相邻两个数比较，较大的数往后，较小的数往上面冒泡
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               }
            }
            System.out.println("第"+i+"步排序结果：");//输出每步排序的结果
            for (int k=0;k<a.length;k++){
                System.out.print(" " + a[k]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] shuzu = new int[SIZE];
        int i;

        for (i=0;i<SIZE;i++){
            shuzu[i]=(int)(100+Math.random()*(100+1));//初始化数组
        }
        System.out.println("排序前的数组为：");
        for (i=0;i<SIZE;i++){
            System.out.print(shuzu[i] + " ");
        }
        System.out.println();
        bubbleSort(shuzu);
        System.out.println("排序后的数组为：");
        for (i=0;i<SIZE;i++){
            System.out.print(shuzu[i]+" ");
        }
        System.out.println();
    }
}
