package aaaaniu.ke.wang.a420;
//输入10个整数，彼此以空格分隔。
//        重新排序以后输出(也按空格分隔)，
//        要求: 1.先输出其中的奇数,并按从大到小排列；
//        2.然后输出其中的偶数,并按从小到大排列。
import java.util.Scanner;

public class jioupaixu {
    static int panduan(int n){
        if (n%2==0){
            return 0;
        }else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int flag=0;
        while (in.hasNext()){
            int[] zhengshu=new int[10];
            int[] jishu=new int[10];
            int[] oushu=new int[10];
            int cj=0;
            int ou=0;
            for (int i=0;i<10;i++){
                zhengshu[i]=in.nextInt();
               flag= panduan(zhengshu[i]);
                if (flag==1){
                    jishu[cj]=zhengshu[i];
                    cj++;
                }else{
                    oushu[ou]=zhengshu[i];
                    ou++;
                }
            }
            for (int i=0;i<cj;i++){
                for (int j=i+1;j<cj;j++){
                    if (jishu[i]<jishu[j]){
                        int t=jishu[i];
                        jishu[i]=jishu[j];
                        jishu[j]=t;
                    }
                }
            }
            for (int i=0;i<ou;i++){
                for (int j=i+1;j<ou;j++){
                    if (oushu[i]>oushu[j]){
                        int t=oushu[i];
                        oushu[i]=oushu[j];
                        oushu[j]=t;
                    }
                }
            }
            for (int i=0;i<cj;i++){
                System.out.print(jishu[i]+" ");
            }
            for (int i=0;i<ou;i++){
                System.out.print(oushu[i]+" ");
            }
        }
    }
}
