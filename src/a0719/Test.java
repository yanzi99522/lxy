package a0719;

/**
 * @author lxy
 */
class LNode{
    int data;//数据域
    LNode next;//下一个结点的引用
}
public class Test {

    //对单链表进行逆序输入参数，head链表头结点
    public static void Reverse(LNode head){
        //判断链表是否为空
        if (head==null||head==null){
            return;
        }
        LNode pre=null;//前驱结点
        LNode cur=null;//当前结点
        LNode next=null;//后继结点

        //把链表首结点变为尾结点
        cur=head.next;
        next=cur.next;
        cur.next=null;
        pre=cur;
        cur=next;
        //使当前遍历到的结点cur指向其前驱结点
        while (cur.next!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=cur.next;
            cur=next;
        }
        //结点最后一个结点指向倒数第二个结点
        cur.next=pre;
        //链表的头结点指向原来链表的尾结点
        head.next=cur;
    }

    public static void main(String[] args) {
        //链表头结点
        LNode head=new LNode();
        head.next=null;
        LNode temp=null;
        LNode cur=head;

        //构造单链表
        for (int i=1;i<8;i++){
            temp=new LNode();
            temp.data=i;
            temp.next=null;
            cur.next=temp;
            cur=temp;
        }
        System.out.println("逆序之前：");
        for (cur=head.next;cur!=null;cur=cur.next){
            System.out.print(cur.data+" ");
        }
        System.out.println();
        System.out.println("逆序之后：");
        Reverse(head);
        for (cur=head.next;cur!=null;cur=cur.next){
            System.out.print(cur.data+" ");
    }

}
}
