package test;

import java.util.Scanner;

//树结构,树Tree
class CBTType{//定义二叉树结点类型
    String data;//元素数据
    CBTType left;//左子树结点引用
    CBTType right;//右子树结点引用
}

public class Tree {
    static final int MAXLEN=20;
    static Scanner input=new Scanner(System.in);// 初始化二叉树的根
    CBTType InitTree() {
        CBTType node;
        if ((node = new CBTType()) != null) {//申请内存
            System.out.println("请先输入一个根结点数据");
            node.data=input.next();
            node.left=null;
            node.right=null;
            if(node!=null){//如果二叉树结点不为空
                return node;
            }
            else {
                return null;
            }
        }
        return null;
    }

    void AddTreeNode(CBTType treeNode){//添加结点
        CBTType pnode,parent;
        String data;
        int menuse;
        if ((pnode=new CBTType())!=null){//分配内存
            System.out.println("输入二叉树结点数据：");

            pnode.data=input.next();
            pnode.left=null;
            pnode.right=null;//设置左右子树为空

            System.out.println("输入该结点的父结点数据：");
            data=input.next();

            parent=TreeFindNode(treeNode,data);//查找指定数据的结点
                if (parent==null){//如果没有找到
                    System.out.println("没有找到该父结点！");
                    pnode=null;//释放创建的结点内存
                    return;
                }
            System.out.println("1.添加该结点到左子树");
            System.out.println("2.添加该结点到右子树");

            do {
                menuse=input.nextInt();//输入选择项
                if (menuse==1||menuse==2){
                    if (parent==null){
                        System.out.println("不存在父结点，请先设置父结点");
                    }
                    else {
                        switch (menuse){
                            case 1:
                                if (parent.left!=null){
                                    System.out.println("左子树结点不为空");
                                }
                                else {
                                    parent.left=pnode;
                                }
                                break;
                            case 2:
                                if (parent.right!=null){
                                    System.out.println("右子树结点不为空！");
                                }
                                else {
                                    parent.right=pnode;
                                }
                                break;
                                default:
                                    System.out.println("无效参数！");
                        }
                    }
                }
            }while (true);
        }
    }

    CBTType TreeFindNode(CBTType treeNode,String data){//查找结点
        CBTType ptr;
        if (treeNode==null){
            return null;
        }
        else {
            if (treeNode.data.equals(data)){
                return treeNode;
            }
            else {//分别向左右子树递归查找
                if((ptr=TreeFindNode(treeNode.left,data))!=null){
                    return ptr;
                }
                else if((ptr=TreeFindNode(treeNode.right,data))!=null){
                    return ptr;
                }
                else{
                    return ptr;
                }
            }
        }
    }

    CBTType TreeLeftNode(CBTType treeNode){//获取左子树
        if (treeNode!=null){
            return treeNode.left;
        }
        else {
            return null;
        }
    }

    CBTType TreeRightNode(CBTType treeNode){//获取右子树
        if (treeNode!=null){
            return treeNode.right;
        }
        else {
            return null;
        }
    }

    int TreeIsEmpty(CBTType treeNode){//判断空树
        if (treeNode!=null){
            return 0;
        }
        else {
            return 1;
        }
    }

    int TreeDepth(CBTType treeNode){//计算二叉树深度
        int depleft,depright;
        if(treeNode==null){
            return 0;//对于空树，深度为0
        }
        else {
            depleft=TreeDepth(treeNode.left);//左子树深度（递归调用）
            depright=TreeDepth(treeNode.right);//右子树深度（递归调用）

            if (depleft>depright){
                return depleft+1;
            }
            else {
                return depright+1;
            }
        }
    }

    void ClearTree(CBTType treeNode){//清空二叉树
        if (treeNode!=null){
            ClearTree(treeNode.left);//清空左子树
            ClearTree(treeNode.right);//清空右子树
            treeNode=null;//释放当前结点所占内存
        }
    }

    void TreeNodeData(CBTType p){//显示结点数据
        System.out.println(p.data);//输出结点数据
    }

    void LevelTree(CBTType treeNode){//按层遍历
        CBTType p;
        CBTType[]q=new CBTType[MAXLEN];//定义一个顺序栈
        int head=0,tail=0;

        if (treeNode!=null){
            tail=(tail+1)%MAXLEN;
            q[tail]=treeNode;
        }
        while (head!=tail){






        }
    }
}
