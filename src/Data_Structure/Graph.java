package Data_Structure;

import java.util.Scanner;

//图的数据结构
class GraphMatrix{
    static final int MaxNum=20;
    static final int MaxValue=65535;
    char[] Vertex = new char[MaxNum];//保存顶点信息（序号或字母）
    int GType;//图的类型（0：无向图。1：有向图）
    int VertexNum;//顶点的数量
    int EdgeNum;//边的数量
    int[][] EdgeWeight = new int[MaxNum][MaxNum];//保存边的权
    int[] isTrav = new int[MaxNum];//遍历标志

}

public class Graph {
    static Scanner input = new Scanner(System.in);
    static void CreateGrapgh(GraphMatrix GM){//创建邻接矩阵图
        int i, j, k;
        int weight;//权
        char EstartV,EendV;//边的起始顶点

        System.out.println("输入图中各顶点信息：");
        for (i=0;i<GM.VertexNum;i++){ //输入顶点
            System.out.println("第"+(i+1)+"个顶点：");
            GM.Vertex[i]=(input.next().toCharArray())[0];//保存到各顶点数组元素中
        }
        System.out.println("输入构成各边的顶点及权值：");

        for (k=0;k<GM.EdgeNum;k++){//输入边的信息
            System.out.println("第" + (k + 1) + "条边");
            EstartV=input.next().charAt(0);
            EendV=input.next().charAt(0);
            weight=input.nextInt();

            for (i=0;EstartV!=GM.Vertex[i];i++);//在已有顶点中查找开始点
            for (j = 0; EendV != GM.Vertex[j]; j++) ;//在已有顶点中查找开始点
            GM.EdgeWeight[i][j]=weight;//对应位置保存权值，表示有一条边
            if (GM.GType==0){
                GM.EdgeWeight[j][i]=weight;//在对角位置保存权值
            }
        }
    }

    static void ClearGraph(GraphMatrix GM){
        int i,j;
        for (i=0;i<GM.VertexNum;i++){//清空矩阵
            for (j=0;j<GM.VertexNum;j++){
                GM.EdgeWeight[i][j]=GraphMatrix.MaxValue;//设置矩阵中各元素的值为MaxValue65535
            }
        }
    }

    static void OutGraph(GraphMatrix GM){//输出邻接矩阵
        int i,j;
        for (j=0;j<GM.VertexNum;j++){
            System.out.printf("\t%c",GM.Vertex[j]);//在第一行输出顶点信息
        }
        System.out.println();
        for (i=0;i<GM.VertexNum;i++){
            System.out.printf("%c",GM.Vertex[i]);
            for (j=0;j<GM.VertexNum;j++){
                if (GM.EdgeWeight[i][j]==GraphMatrix.MaxValue){//若权值为最大值
                    System.out.printf("\tZ");//以Z表示无穷大
                }
                else {
                    System.out.printf("\t%d",GM.EdgeWeight[i][j]);//输出边的权值
                }
            }
            System.out.println();
        }
    }

    static void DeepTraOne(GraphMatrix GM,int n){//从第n个结点开始，深度遍历图
        int i;
        GM.isTrav[n]=1;//标记该顶点已处理过
        System.out.printf("->%c", GM.Vertex[n]);//输出结点数据

        //添加处理结点的操作
        for (i=0;i<GM.VertexNum;i++){
            if (GM.EdgeWeight[n][i]!=GraphMatrix.MaxValue&&GM.isTrav[n]==0){
                DeepTraOne(GM,i);//递归进行遍历
            }
        }
    }

    static void DeepTraGraph(GraphMatrix GM){//深度优先遍历
        int i;
        for (i=0;i<GM.VertexNum;i++){//清除各顶点遍历标志
            GM.isTrav[i]=0;
        }
        System.out.println("深度优先遍历结点");
        for (i=0;i<GM.VertexNum;i++){
            if(GM.isTrav[i]==0){//若该结点未遍历
                DeepTraOne(GM,i);//调用函数遍历
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GraphMatrix GM=new GraphMatrix();//定义保存邻接表结构的图

        System.out.println("输入生成图的类型：");
        GM.GType=input.nextInt();//图的种类
        System.out.println("输入图的顶点数量：");
        GM.VertexNum=input.nextInt();//输入图顶点数
        System.out.println("输入图的边数量：");
        GM.EdgeNum=input.nextInt();//输入图 边数
        ClearGraph(GM);//清空图
        CreateGrapgh(GM);//生成邻接表结构的图
        System.out.println("该图的邻接矩阵数据如下：");
        OutGraph(GM);//输出邻接矩阵
        DeepTraGraph(GM);//深度优先搜索遍历图
    }
}
