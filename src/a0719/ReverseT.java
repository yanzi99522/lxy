package a0719;

/**
 * @author lxy
 */
class LNode2{
    int data;
    LNode2 next;
}
public class ReverseT {
    public static void Reverse2(LNode2 head){
        //判断链表是否为空
        if (head==null||head.next==null){
            return;
        }
        LNode2 cur=null;//当前结点
        LNode2 next=null;//后继结点
        cur=head.next.next;
        //设置链表第一个结点为尾结点
        head.next.next=null;
        //把遍历到结点插入到头结点的后面
        while (cur!=null){
            next=cur.next;
            cur.next=head.next;
            head.next=cur;
            cur=next;
        }
    }
}
