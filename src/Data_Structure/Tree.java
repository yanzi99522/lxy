package Data_Structure;

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
                                if (parent.left!=null){//添加到左结点
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
            }while(menuse!=1&&menuse!=2);
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
        while (head!=tail){//队列不为空，进行循环
            head=(head+1)%MAXLEN;
            p=q[head];
            TreeNodeData(p);
            if(p.left!=null){
                tail=(tail+1)%MAXLEN;
                q[tail]=p.left;
            }

            if(p.right!=null){
                tail=(tail+1)%MAXLEN;
                q[tail]=p.right;
            }
        }
    }

    void DLRTree(CBTType treeNode){//先序遍历
        if (treeNode!=null){
            TreeNodeData(treeNode);//显示结点的数据
            DLRTree(treeNode.left);
            DLRTree(treeNode.right);
        }
    }

    void LDRTree(CBTType treeNode){//中序遍历
        if(treeNode!=null){
            LDRTree(treeNode.left);//中序遍历左子树
            TreeNodeData(treeNode);//显示结点数据
            LDRTree(treeNode.right);//中序遍历右子树
        }
    }

    void LRDTree(CBTType treeNode){//后序遍历
        if(treeNode!=null){
            LRDTree(treeNode.left);//后序遍历左子树
            LDRTree(treeNode.right);//后序遍历右子树
            TreeNodeData(treeNode);//显示结点数据
        }
    }

    public static void main(String[] args) {
        CBTType root=null;//root为指向二叉树根结点的引用
        int menuse;
        Tree t =new Tree();
        //设置根元素
        root=t.InitTree();
        //添加结点
        do {
            System.out.println("请选择菜单添加二叉树的结点：");
            System.out.println("0.退出");
            System.out.println("1.添加二叉树的结点");
            menuse=input.nextInt();
            switch (menuse){
                case 1:
                    t.AddTreeNode(root);//添加结点
                    break;
                case 0:
                    break;
                    default:
                        ;
            }
        }while (menuse!=0);

        //遍历
        do {
            System.out.println("请选择菜单遍历二叉树，输入0表示退出：");
            System.out.println("1.先序遍历DLR:");//显示菜单
            System.out.println("2.中序遍历LDR:");
            System.out.println("3.后序遍历LRD");
            System.out.println("4.按层遍历");

            menuse = input.nextInt();
            switch (menuse) {
                case 0:
                    break;

                case 1:
                    //先序遍历
                    System.out.println("先序遍历的结果：");
                    t.DLRTree(root);
                    System.out.println();
                    break;
                case 2:
                    //中序遍历
                    System.out.println("中序遍历的结果：");
                    t.LDRTree(root);
                    System.out.println();
                    break;
                case 3:
                    //后序遍历
                    System.out.println("后序遍历的结果：");
                    t.LRDTree(root);
                    System.out.println();
                    break;
                case 4:
                    //按层遍历
                    System.out.println("按层遍历的结果：");
                    t.LevelTree(root);
                    System.out.println();
                    break;
                default:
                    ;
            }
        } while (menuse != 0);
        //深度
        System.out.println("二叉树深度为" + t.TreeDepth(root));
        t.ClearTree(root);
        root=null;//清空二叉树
    }
}
