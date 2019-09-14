package DataStructureBook.shujujiegou;

import java.util.Scanner;

public class SeqListTest {
    public static void main(String[] args) {
        int i;
        SeqListType SL=new SeqListType();
        DATA pdata;
        String key;
        System.out.println("顺序表操作演示：");
        SL.SeqListInit(SL);
        System.out.println("初始化顺序表完成！");
        System.out.println(SL.Listlength);

        Scanner in=new Scanner(System.in);

        do {
            System.out.println("输入添加的结点（学号 姓名 年龄）：");
            DATA data=new DATA();
            data.key=in.next();
            data.name=in.next();
            data.age=in.nextInt();

            if (data.age!=0){
                if (SL.SeqListAdd(SL,data)==0){
                    break;
                }
            }
            else {
                break;
            }
        }while (true);

        System.out.println("顺序表中的结点顺序为：");
//        SL.ShowAllSeqList(SL);

        System.out.println("要取出的结点的序号：");
        i=in.nextInt();
        pdata=SL.SeqListFind(SL,i);
        if (pdata!=null){
            System.out.printf("第"+i+"个结点为："+"(%s,%s,&d)"+pdata.key,pdata.name,pdata.age);
        }

        System.out.println("输入要查找结点的关键字：");
        key=in.next();
        i=SL.SeqListFindByCount(SL,key);
        if (pdata!=null){
            System.out.println("第"+i+"个结点的值是"+key);
        }
    }
}
