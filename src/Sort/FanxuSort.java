package Sort;

public class FanxuSort {
    static final int SIZE=10;
    static void insertionSort(int[] a,int len){//插入排序
        int i,j,t,h;
        for (i=1;i<len;i++){
            t=a[i];j=i-1;
            while (j>=0&&t>a[j]){//反序
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=t;

            System.out.println("第" + i + "步排序结果");
            for (h=0;h<len;h++){
                System.out.print(" "+a[h]);//输出
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

        System.out.println("排序之前的数组为：");
        for (i=0;i<SIZE;i++){
            System.out.print(shuzu[i] + " ");
        }
        System.out.println();
        insertionSort(shuzu,SIZE);
        System.out.println("排序之后的数组为：");
        for (i=0;i<SIZE;i++){
            System.out.print(shuzu[i]+" ");
        }
        System.out.println();
    }


}
