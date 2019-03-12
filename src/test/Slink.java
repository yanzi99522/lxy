package test;

import java.util.Scanner;

class DATA{ //结点的关键字
    String key;
    String name;
    int age;
}

class SLType{ //定义顺序表结构
    static final int MAXLEN = 100;
    DATA[] ListData = new DATA[MAXLEN + 1];
    int Listlen;

    void SLInit(SLType SL){//初始化顺序表
        SL.Listlen=0;//初始化为空表
    }

    int SLLength(SLType SL) {
        return (SL.Listlen);//返回顺序表的元素数量
    }

    int SLInsert(SLType SL, int n, DATA data) {
        int i;
        if(SL.Listlen>=MAXLEN){
            System.out.println("顺序表已经满，不能插入结点");
            return 0;
        }
        if (n<1||n>SL.Listlen-1){
            System.out.println("插入序号有误！不能插入元素");
            return 0;
        }
        for (i=SL.Listlen;i>=n;i--){    //插入结点
            SL.ListData[i+1]=SL.ListData[i];//将顺序表中的数据向后移动
        }
        SL.ListData[n]=data;
        SL.Listlen++;
        return 1;
    }

    int SLAdd(SLType SL,DATA data){
        if (SL.Listlen>=MAXLEN){
            System.out.println("顺序表已满，不能插入数据！");
            return 0;
        }
        SL.ListData[++SL.Listlen]=data;
        return 1;
    }

    int SLDelete(SLType SL,int n){
        int i;
        if(n<1||n>MAXLEN){
            System.out.println("删除序号有误，不能删除结点！");
            return 0;
        }
        for (i=n;i<SL.Listlen;i++){
            SL.ListData[i]=SL.ListData[i+1];
        }
        SL.Listlen--;
        return 1;
    }

    DATA SLFindByNum(SLType SL,int n){
        if (n<1||n>MAXLEN){
            System.out.println("序号有误，无法查询！");
            return null;
        }
        return SL.ListData[n];
    }

    int SLFindByCont(SLType SL,String key){//按照关键字查询结点
        int i;
        for (i=1;i<=SL.Listlen;i++){
            if (SL.ListData[i].key.compareTo(key)==0){
                return i;
            }
        }
        return 0;
    }

    int SLAll(SLType SL){ //显示所有结点
        int i;
        for (i=1;i<=SL.Listlen;i++){
            System.out.printf("(%s,%s,%d)\n",SL.ListData[i].key,SL.ListData[i].name,SL.ListData[i].age);
        }
        return 0;
    }


}

public class Slink {
    //main（）方法首先初始化顺序表
    //然后循环添加数据结点
    //当输入全部为0的时候退出结点添加的过程
    //显示所有的结点数据
    //按照序号和关键字进行结点的查找
    public static void main(String[] args) {
        int i;
        SLType SL=new SLType();
        DATA pdata;
        String key;
        System.out.println("顺序表操作演示：");
        SL.SLInit(SL);
        System.out.println("初始化顺序表完成！");
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("输入添加的节点（学号 姓名 年龄）：");
            DATA data=new DATA();
            data.key=input.next();
            data.name=input.next();
            data.age=input.nextInt();

            if (data.age!=0){
                if (SL.SLAdd(SL,data)==0){
                    break;
                }
            }
            else {
                break;
            }
        }while (true);
        System.out.println("顺序表中的结点顺序为：");
        SL.SLAll(SL);

        System.out.println("要取出结点的序号：");
        i=input.nextInt();
        pdata = SL.SLFindByNum(SL, i);
        if (pdata!=null){
            System.out.printf("第%d个结点为：(%s,%s,%d)\n",i,pdata.key,pdata.name,pdata.age);
        }

        System.out.println("要查找的关键字：");
        key=input.next();
        i = SL.SLFindByCont(SL, key);
        pdata = SL.SLFindByNum(SL, i);
        if (pdata!=null){
            System.out.printf("第%d个结点为：(%s,%s,%d)\n",i,pdata.key,pdata.name,pdata.age);
        }
    }
}
