package Sort;

public class SelectSort {
    static final int SIZE=10;
    public static void selectSort(int[] a){
        int index,temp;
        for(int i=0;i<a.length;i++){
            index=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[index]){
                    index=j;
                }
            }
            //交换两个数
            if (index!=i){
                temp=a[i];
                a[i]=a[index];
                a[index]=temp;
            }
            System.out.println("第"+i+"步的排序结果为：");//输出每步排序的结果
            for (int h=0;h<a.length;h++){
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
        System.out.println("输出排序前的数组为：");
        for (i=0;i<SIZE;i++){
            System.out.print(shuzu[i] + " ");
        }
        System.out.println();
        selectSort(shuzu);
        System.out.println("排序之后的数组为：");
        for (i=0;i<SIZE;i++){
            System.out.print(shuzu[i] + " ");
        }
        System.out.println();
    }
}
