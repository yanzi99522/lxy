package a630;

import Data_Structure.Tree;

import java.util.Scanner;

/**
 * @author lxy
 */
class TwoTree{//定义二叉树结点类型
    String data;//元素数据
    TwoTree left;//左子树
   TwoTree right;//右子树
}
public class Erchashu {
   static final int MaxLen=20;
   static Scanner input=new Scanner(System.in);
   TwoTree InitTree(){//初始化二叉树
       TwoTree node;
       if ((node=new TwoTree())!=null){
           System.out.println("请先输入一个根结点数据：");
           node.data=input.next();
           node.left=null;
           node.right=null;
           if (node!=null){
               return node;
           }else {
               return null;
           }
       }
       return null;
   }

   void AddTreeNode(TwoTree treeNode){
       TwoTree pnode,parent;
       String data;
       int LDflag;

       if ((pnode=new TwoTree())!=null){//分配内存
           System.out.println("输入要添加的二叉树结点数据：");
           pnode.data=input.next();
           pnode.left=null;
           pnode.right=null;//设置左右子树为空

           System.out.println("输入该结点的父结点数据：");
           data=input.next();

           parent= TreeFindNode(treeNode,data);//查找指定数据的结点
           if (parent==null){
               System.out.println("没有找到该结点");
               pnode=null;
               return;
           }
           System.out.println("1.添加该结点到左子树。2.添加该结点到右子树");
           do {
               LDflag=input.nextInt();
               if (LDflag==1||LDflag==2){
                   if (parent==null){
                       System.out.println("不存在父结点，请先设置父结点");
                   }else {
                       switch (LDflag){
                           case 1:
                               if (parent.left!=null){
                                   System.out.println("左子树结点不为空，无法插入");
                               }else {
                                   parent.left=pnode;
                               }
                               break;
                           case 2:
                               if (parent.right!=null){
                                   System.out.println("右子树结点不为空，无法插入");
                               }else {
                                   parent.right=pnode;

                               }
                               break;
                               default:
                                   System.out.println("无效参数");
                       }
                   }
               }
           }while (LDflag!=1&&LDflag!=2);
           }
   }

   TwoTree TreeFindNode(TwoTree treeNode,String data){//查找结点

       TwoTree ptr;
       if (treeNode==null){
           return null;
       }else {
           if (treeNode.data.equals(data)){
               return treeNode;
           }else {//分别向左右子树递归查找
               if ((ptr=TreeFindNode(treeNode.left,data))!=null){
                   return ptr;
               }else {
                   return null;
               }

           }
       }
   }
   //获取左子树
    TwoTree TreeLeftNode(TwoTree treeNode){
       if (treeNode!=null){
           return treeNode.left;//返回值
       }else {
           return null;
       }
    }

    //获取右子树
    TwoTree TreeRightNode(TwoTree treeNode){
       if (treeNode!=null){
           return treeNode.right;
       }else {
           return null;
       }
    }

    //判断空树
    int  IsEmptyTree(TwoTree treeNode){
       if (treeNode!=null){
           return 0;
       }else {
           return 1;
       }
    }

    //计算二叉树深度
    int TreeDepth(TwoTree treeNode){
       int depleft,depright;
       if (treeNode==null){
           return 0;//空树，深度为0
       }
       else {
           depleft=TreeDepth(treeNode.left);//左子树深度（递归调用）
           depright=TreeDepth(treeNode.right);//右子树深度，递归调用
           if (depleft<depright){
               return depleft+1;
           }else {
               return depright+1;
           }
       }
    }
    //清空二叉树
    void ClearTree(TwoTree tree){
       if (tree!=null){
           ClearTree(tree.left);//清空左子树
           ClearTree(tree.right);//清空右子树
           tree=null;//释放当前结点所占内存
       }
    }

    //显示结点数据
    void TreeNodeData(TwoTree p){
        System.out.printf("%s",p.data);
    }

    //按层遍历
    void LeverTree(TwoTree tree){
       TwoTree p;
       TwoTree[] q=new TwoTree[MaxLen];//定义一个顺序栈
        int head=0,tail=0;
        if (tree!=null){
            tail=(tail+1)%MaxLen;
            q[tail]=tree;
        }
        while (head!=tail){
            head=(head+1)%MaxLen;
            p=q[head];
            TreeNodeData(p);
            if (p.left!=null){
                tail=(tail+1)%MaxLen;
            }
            if (p.right!=null){
                tail=(tail+1)%MaxLen;
                q[tail]=p.right;
            }
        }
    }

    //先序遍历
    void DLRtree(TwoTree tree){
       if (tree!=null){
           TreeNodeData(tree);
           DLRtree(tree.left);
           DLRtree(tree.right);
       }
    }

    //中序遍历
    void LDRtree(TwoTree tree){
       if (tree!=null){
           LDRtree(tree.left);
           TreeNodeData(tree);
           LDRtree(tree.right);
       }
    }

    //后序遍历
    void LRDtree(TwoTree tree){
       if (tree!=null){
           LRDtree(tree.left);
           LRDtree(tree.right);
           TreeNodeData(tree);
       }
    }

    public static void main(String[] args) {
        TwoTree root=null;
        int LFflag;
        Erchashu t=new Erchashu();
        //设置根元素
        root=t.InitTree();
        //添加结点
        do {
            System.out.println("请选择菜单添加二叉树的结点");
            System.out.printf("0 退出、\t");
            System.out.println("1.添加二叉树的结点");
            LFflag=input.nextInt();
            switch (LFflag){
                case 1:t.AddTreeNode(root);
                break;
                case 0:break;
                default:
                    ;
            }
        }while (LFflag!=0);

        //遍历
        do {
            System.out.println("请选择菜单遍历二叉树，输入0表示退出");
            System.out.printf("1.先序遍历、\t");
            System.out.println("2.中序遍历");
            System.out.println("3.后序遍历");
            System.out.println("4.按层遍历");
            LFflag=input.nextInt();
            switch (LFflag){
                case 0:break;
                case 1:
                    System.out.println("先序遍历DLR的结果：");
                    t.DLRtree(root);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("中序遍历的结果");
                    t.LDRtree(root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("后序遍历的结果：");
                    t.LRDtree(root);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("按层遍历的结果：");
                    t.LeverTree(root);
                    System.out.println();
                    break;
                    default:
                        ;
            }
        }while (LFflag!=0);
        //深度
        System.out.println("二叉树深度：");
        System.out.println(t.TreeDepth(root));
        t.ClearTree(root);//清空二叉树
        root=null;
    }
}
