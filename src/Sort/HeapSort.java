package Sort;
//堆排序
public class HeapSort {
    static final int SIZE = 10;

    static void heapSort(int a[], int n) {
        int i, j, h, k;
        int t;

        for (i = n / 2 - 1; i >= 0; i--) {//将a[o,n-1]建成大顶堆
            while (2 * 1 + 1 < n) {//第i个结点有右子树
                j = 2 * i + 1;
                if ((j + 1) < i) {
                    if (a[j] < a[j + 1]) {//右左子树小于右子树，则需要比较右子树
                        j++;
                    }//序号增加1，指向右子树
                }
                if (a[i] < a[j]) {//比较i与j为序号的数据
                    t = a[i];//交换数据
                    a[i] = a[j];
                    a[j] = t;
                    i = j;//堆被破坏，需要重新调整
                } else {//比较左右子结点均大则堆未破坏，不再需要调整
                    break;
                }
            }
        }

        //输出构成的堆
        System.out.println("原数据构成的堆：");
        for (h=0;h<n;h++){
            System.out.print(" "+a[h]);//输出
        }
        System.out.println();

        for (i=n-1;i>0;i--){
            t=a[0];//与第i个记录交换
            a[0]=a[i];
            a[i]=t;
            k=0;
            while (2*k+1<i){//第i个结点有右子树
                j=2*k+1;
                if((j+1)<i){
                    if (a[j]<a[j+1]){//右左子树小于右子树，则需要比较右子树
                        j++;//序号增加1，指向右子树
                    }
                }
                if (a[k]<a[j]){//比较i与j为序号的数据
                    t=a[k];//交换数据
                    a[k]=a[j];
                    a[j]=t;
                    k=j;//堆被破坏，需要重新调整
                }
                else {
                    break;
                }
            }
            System.out.print("第" + (n - i) + "步排序结果：");
            for (h=0;h<n;h++){
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

        System.out.println("排序之前的数组为：");//输出排序之前的数组
        for (i=0;i<SIZE;i++){
            System.out.print(shuzu[i] + " ");
        }
        System.out.println();

        heapSort(shuzu, SIZE);//排序操作

        System.out.println("排序之后的数组为：");
        for (i=0;i<SIZE;i++){
            System.out.print(shuzu[i] + " ");//输出排序之后的数组
        }
        System.out.println();
    }
}