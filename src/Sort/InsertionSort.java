package Sort;

//插入排序
public class InsertionSort {
    static final int SIZE = 10;

    static void insertSort(int a[]) {
        int i, j, t, h;
        for (i = 1; i < a.length; i++) {
            t = a[i];
            j = i - 1;
            while (j >= 0 && t < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = t;
            System.out.println("第" + i+ "步排序的结果为：");
            for (h = 0; h < a.length; h++) {
                System.out.print(" " + a[h]);//输出
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] shuzu=new int[SIZE];
        int i;

        for (i=0;i<SIZE;i++){
            shuzu[i]=(int)(100*Math.random());//初始化数组
        }
        System.out.println("排序前的数组为：");
        for (i=0;i<SIZE;i++){
            System.out.print(shuzu[i]+" ");
        }
        System.out.println();
        insertSort(shuzu);

        System.out.println("排序之后的数组为：");
        for (i=0;i<SIZE;i++){
            System.out.print(shuzu[i] + " ");
        }
        System.out.println();
    }
}
