package test;

import java.util.Scanner;

//链表
class DATA2{
    String key;//结点的关键字
    String name;
    int age;
}

class CLType{
    DATA2 nodeData=new DATA2();
    CLType nextNode;

    CLType CLAddEnd(CLType head,DATA2 nodeData){ //追加结点
        CLType node,htemp;
        if ((node=new CLType())==null){
            System.out.println("申请内存失败！");
            return null;
        }
        else {
            node.nodeData=nodeData; //保存数据
            node.nextNode=null;
            if (head==null){
                head=node;
                return head;
            }
            htemp=head;
            while (htemp.nextNode!=null){
                htemp=htemp.nextNode;
            }
            htemp.nextNode=node;
        }
        return head;
    }


    CLType CLAddFirst(CLType head,DATA2 nodeData){
        CLType node;
        if ((node=new CLType())!=null){
            System.out.println("申请内存失败！");
            return null;
        }
        else {
            node.nodeData=nodeData;
            node.nextNode=head;
            head=node;
            return head;
        }
    }
    CLType CLFindNode(CLType head,String key){
        CLType htemp;
        htemp=head;
        while (htemp!=null){
            if (htemp.nodeData.key.compareTo(key)==0){
                return htemp;
            }
            htemp=htemp.nextNode;
        }
        return null;
    }

    CLType CLInsertNode(CLType head,String findkey,DATA2 nodeData){
        CLType node,nodetemp;
        if((node=new CLType())==null){
            System.out.println("申请内存失败！");
            return null;
        }
        node.nodeData=nodeData;
        nodetemp=CLFindNode(head,findkey);
        if (nodetemp!=null){
            node.nextNode=nodetemp.nextNode;
            nodetemp.nextNode=node;
        }
        else {
            System.out.println("没有找到正确的插入位置！");
//            free(node);
        }
        return head;
    }
    int CLDeleteNode(CLType head,String key){
        CLType node,htemp;
        htemp=head;
        node=head;
        while (htemp!=null){
            if (htemp.nodeData.key.compareTo(key)==0){
                node.nextNode=htemp.nextNode;
//                free(htemp);
                return 1;
            }
            else {
                node=htemp;
                htemp=htemp.nextNode;
            }
        }
        return 0;
    }

    int CLLength(CLType head){
        CLType htemp;
        int len=0;
        htemp=head;
        while (htemp!=null){
            len++;
            htemp=htemp.nextNode;
        }
        return len;
    }

    void CLAllnode(CLType head){
        CLType htemp;
        DATA2 nodeData;
        htemp=head;
        System.out.println("当前链表共有"+CLLength(head)+"个结点，链表所有数据如下：");
        while (htemp!=null){
            nodeData=htemp.nodeData;
            System.out.println("结点"+nodeData.key+nodeData.name+nodeData.age);
            htemp=htemp.nextNode;
        }
    }
}

public class Clink {
    //main（)主方法首先初始化链表
    //然后循环添加数据结点，当输入全部是000的时候退出结点添加过程
    //接下来显示所有的结点数据
    //演示插入结点
    //演示删除结点
    //演示查找结点
    public static void main(String[] args) {
        CLType node,head=null;
        CLType CL=new CLType();
        String key,findkey;
        Scanner input=new Scanner(System.in);
        System.out.println("链表测试：先输入链表中的数据，格式为：关键字，姓名，年龄");
        do {
            DATA2 nodeData=new DATA2();
            nodeData.key=input.next();
            if (nodeData.key.equals("0")){
                break;
            }
            else {
                nodeData.name=input.next();
                nodeData.age=input.nextInt();
                head=CL.CLAddEnd(head,nodeData);
            }
        }while (true);
        CL.CLAllnode(head);
        System.out.println("演示插入结点，输入插入位置的关键字：");
        findkey=input.next();
        System.out.println("输入插入结点的数据（关键字 姓名 年龄）");
        DATA2 nodeData=new DATA2();
        nodeData.key=input.next();
        nodeData.name=input.next();
        nodeData.age=input.nextInt();
        head=CL.CLInsertNode(head,findkey,nodeData);
        CL.CLAllnode(head);
        System.out.println("演示删除结点，请输入要删除的关键字");
        key=input.next();
        CL.CLDeleteNode(head,key);
        CL.CLAllnode(head);

        System.out.println("演示在链表中查找，输入查找关键字：");

        key=input.next();
        node=CL.CLFindNode(head,key);
        if (node!=null){
            nodeData=node.nodeData;
            System.out.println("关键字对应的节点是"+key+nodeData.key+nodeData.name+nodeData.age);
        }
        else {
            System.out.println("在链表中没有找到关键字为"+key+"的结点!");
        }
    }
}
