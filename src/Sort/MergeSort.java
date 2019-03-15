package Sort;

public class MergeSort {
    static  final int SIZE=15;
    static void mergeOne(int a[],int b[],int n,int len){
        int i,j,k,s,e;

        s=0;
        while (s+len<n){
          e=s+2*len-1;
          if(e>=n){//最后一段可能少于len个结点
              e=n-1;
            }
          //相邻有序段合并
            k=s;
          i=s;
          j=s+len;
          while (i<s+len&&j<=e){
              if(a[i]<=a[j]){
                  b[k++]=a[i++];
              }
              else {
                  b[k++]=a[j++];
              }
          }
          while (i<s+len){//未合并的部分复制到数组b中
              b[k++]=a[i++];
          }
          while (j<=e){
              b[k++]=a[j++];//未合并的部分复制到数组b中
          }
          s=e+1;
        }
        if ((s < n)) {

            for (;s<n;s++){
                b[s]=a[s];
            }
        }
    }
    static void mergeSort(int a[],int n){//合并排序
        int h,count,len,f;
        count=0;//排序步骤
        len=1;//有序序列的长度
        f=0;//变量f作标志

        int[] p=new int[n];
        while ((len<n)){
            if(f==1){//交替在A和P之间合并
                mergeOne(p,a,n,len);//p合并到p
            }
            else {
                mergeOne(a,p,n,len);//a合并到p
            }
            len=len*2;//增加有序序列长度
            f=1-f;//使f值在0和1之间切换

            count++;
            System.out.println("第" + count + "步排序结果：");
            for (h=0;h<SIZE;h++){
                System.out.print(" "+a[h]);//输出
            }
            System.out.println();
        }
        if (f==1){//如果进行了排序
            for (h=0;h<n;h++){//将内存p中的数据复制回数组a
                a[h]=p[h];
            }
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
            System.out.print(shuzu[i]+" ");
        }
        System.out.println();

        mergeSort(shuzu, SIZE);//排序操作
        System.out.println("排序之后的数组为：");
        for (i=0;i<SIZE;i++){
            System.out.print(shuzu[i] +" ");//输出排序后的数组
        }
        System.out.println();
    }
}
