package a630;

import java.util.Scanner;

/**
 * @author lxy
 */
class TU{
    static final int Maxnum=20;
    static final int Maxvalue=65535;
    char[] Dingdian=new char[Maxnum];
    int TUTYPE;
    int DNUM;
    int ENUM;
    int[][] EWEIGHT=new int[Maxnum][Maxnum];
    int[] isTraav=new int[Maxnum];
}
public class Graph {
    static Scanner input=new Scanner(System.in);
    static void CreateTU(TU tu){
        int i,j,k;
        int weight;
        char Estrat,Eend;
        System.out.println("输入图中各顶点信息：");
        for(i=0;i<tu.DNUM;i++){
            System.out.println("第"+(i+1)+"个顶点：");
            tu.Dingdian[i]=(input.next().toCharArray())[0];
        }
        System.out.println("输入构成各边的顶点及权值：");
        for (k=0;k<tu.ENUM;k++){
            System.out.println("第" + (k + 1) + "条边：");
            Estrat=input.next().charAt(0);
            Eend=input.next().charAt(0);
            weight=input.nextInt();
            for (i=0;Estrat!=tu.Dingdian[i];i++){

            }
            for (j=0;Eend!=tu.Dingdian[j];j++){

            }
            tu.EWEIGHT[i][j]=weight;
            if (tu.TUTYPE==0){
                tu.EWEIGHT[j][i]=weight;
            }
        }
    }

    //清空矩阵
    static void ClearGraph(TU tu){
        int i,j;
        for (i=0;i<tu.DNUM;i++){
            for (j=0;j<tu.DNUM;j++){
                tu.EWEIGHT[i][j]=TU.Maxvalue;
            }
        }
    }

    //输出邻接矩阵
    static void OutGraph(TU tu){
        int i,j;
        for (j=0;j<tu.DNUM;j++){
            System.out.printf("\t"+tu.Dingdian[j] );
        }
        System.out.println();
        for (i=0;i<tu.DNUM;i++){
            System.out.print(tu.Dingdian[i]);
            for (j=0;j<tu.DNUM;j++){
                if (tu.EWEIGHT[i][j]==TU.Maxvalue){
                    System.out.printf("\tZ");
                }else {
                    System.out.printf("\t%d",tu.EWEIGHT[i][j]);
                }
            }
            System.out.println();
        }
    }
    static void DeepGraph(TU tu,int n){//深度遍历
            int i;
            tu.isTraav[n]=1;
        System.out.printf("->%c",tu.Dingdian[n]);
        //添加处理节点的操作
        for (i=0;i<tu.DNUM;i++){
            if (tu.EWEIGHT[n][i]!=TU.Maxvalue&&tu.isTraav[n]==0){
                DeepGraph(tu,i);
            }
        }
    }
    static void DeepTraGraph(TU tu){
        int i;
        for (i=0;i<tu.DNUM;i++){
            tu.isTraav[i]=0;
        }
        System.out.println("深度优先遍历结点：");
        for (i=0;i<tu.DNUM;i++){
            if (tu.isTraav[i]==0){
                DeepGraph(tu,i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TU tu=new TU();
        System.out.println("输入生成图的类型：(输入“0”表示无向图，输入“1”表示有向图");
        tu.TUTYPE=input.nextInt();
        System.out.println("输入图的顶点数量：");
        tu.DNUM=input.nextInt();
        System.out.println("输入图的边数量：");
        tu.ENUM=input.nextInt();
        ClearGraph(tu);//清空图
        CreateTU(tu);
        System.out.println("该图的邻接矩阵数据如下：");
        OutGraph(tu);
        DeepTraGraph(tu);
    }
}
