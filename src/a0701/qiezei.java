package a0701;

import java.util.Scanner;

/**
 * @author lxy
 */
class GType{
    double value;
    double weight;
    char isSelect;
}
public class qiezei {
    static double maxvalue;//方案最大价值
    static  double totalvalue;//物品总价值
    static double maxweight;//能拿的最大重量
    static int num;//物品数量
    static char[] seltemp;//临时数组

    static void backpack(GType[] goods,int i,double weighttotal,double valuetotal){
        int k;
        if (weighttotal+goods[i].weight<=maxweight){
            seltemp[i]=1;
            if (i<num-1){//如果物品i不是最后一个物品
                backpack(goods,i+1,weighttotal+goods[i].weight,valuetotal);
            }else {
                for (k=0;k<num;++k){
                    goods[k].isSelect=seltemp[k];
                }
                maxvalue=valuetotal;//保存当前方案的最大价值
            }
        }
        seltemp[i]=0;
        if (valuetotal-goods[i].value>maxvalue){
            if (i<num-1){
                backpack(goods,i+1,weighttotal,valuetotal-goods[i].value);
            }else {
                for (k=0;k<num;++k){
                    goods[k].isSelect=seltemp[k];
                }
                maxvalue=valuetotal-goods[i].value;
            }
        }
    }

    public static void main(String[] args) {
        double sumweight;
        int i;
        System.out.println("窃贼问题求解");
        System.out.println("窃贼背包能容纳的最大重量：");
        Scanner in=new Scanner(System.in);
        maxweight=in.nextDouble();
        System.out.println("可选物品数量：");
        num=in.nextInt();

        GType[]goods=new GType[num];
        seltemp=new char[num];

        totalvalue=0;
        for (i=0;i<num;i++){
            GType type=new GType();
            System.out.println("输入第" + (i+1) + "号物品的重量和价值：");
            type.weight=in.nextDouble();
            type.value=in.nextDouble();
            totalvalue+=type.value;
            goods[i]=type;
        }
        System.out.println("背包最大能装的重量为：" + maxweight);
        for (i=0;i<num;i++){
            System.out.println("第" + (i + 1) + "号物品重：" + goods[i].weight + "价值：" + goods[i].value);
        }
        for (i=0;i<num;i++){
            seltemp[i]=0;
        }
        maxvalue=0;
        backpack(goods, 0, 0.0, totalvalue);
        sumweight=0;
        System.out.println("可将以下物品装入背包，使背包装的物品价值最大：");
        for (i=0;i<num;i++){
            if (goods[i].isSelect==1){
                System.out.println("第" + (i + 1) + "号物品，重量：" + goods[i].weight + "价值：" + goods[i].value);
                sumweight+=goods[i].weight;
            }
        }
        System.out.println("总重量为："+sumweight+", 总价值为："+maxvalue);
    }
}
