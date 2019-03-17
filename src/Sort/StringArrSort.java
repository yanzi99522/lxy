package Sort;
//字符串数组的排序
//建立一个指向字符串的字符指针数组，在排序需要交换字符串的位置时，只需交换指针即可
public class StringArrSort {
    static final int N=5;
    //输入参数arr一般为一个字符串数组的首地址，输入参数left指向数组最左边的值，输入参数right指向数组最右边的值
    static void quickSort(String[] arr,int left,int right){//快速排序算法
        String f,t;
        int rtemp,ltemp;

        ltemp=left;
        rtemp=right;
        f=arr[(left+right)/2];//分界值
        while (ltemp<rtemp){
            while (arr[ltemp].compareTo(f)<0){
                ++ltemp;
            }
            while (arr[rtemp].compareTo(f)>0){
                --rtemp;
            }
            if (ltemp<=rtemp){
                t=arr[ltemp];
                arr[ltemp]=arr[rtemp];
                arr[rtemp]=t;
                --rtemp;
                ++ltemp;
            }
        }
        if (ltemp==rtemp){
            ltemp++;
        }

        if (left<rtemp){
            quickSort(arr,left,ltemp-1);//递归调用
        }
        if (ltemp<right){
            quickSort(arr,rtemp+1,right);//递归调用
        }
    }
//主方法main（)首先初始化一个字符串指针数组，并输出排序前的内容。然后，调用QuickSort()排序法子方法，接着输出排序后的内容
    //使用String类型来声明字符串数组，并初始化字符串数组，分别指向5个不同字符串。
    //在对字符串进行排序时，使用QucikSort()方法，用递归的方式对字符串进行排序
    //定义两个字符串变量用来作为临时变量，保存比较的字符串。
    //使用compareTo（）方法比较两个字符串的大小
    //通过交换字符串，完成字符串顺序的重新排列
    public static void main(String[] args) {
        String[] arr=new String[]{"One","World","Dream","Beijing","Olympic"};//声明并初始化

        int i;
        System.out.println("排序之前：");
        for (i=0;i<N;i++){
            System.out.println(arr[i]);//输出排序之前
        }

        quickSort(arr,0,N-1);//排序

        System.out.println("排序之后：");
        for (i=0;i<N;i++){
            System.out.println(arr[i]);//输出排序后
        }
    }
}
