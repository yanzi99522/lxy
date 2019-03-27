package Lianbiao;
//链表的类型声明
//单向链表
public class LinkNode {
    private int data;
    private LinkNode next;
    public LinkNode(int data){
        this.data=data;
    }
    public void setData(int data){
        this.data=data;
    }
    public int getData(){
        return data;
    }
    public void setNext(LinkNode next){
        this.next=next;
    }
    public LinkNode getNext(){
        return this.next;
    }
    //链表长度
    int ListLength(LinkNode headNode){
        int length=0;
        LinkNode currentNode=headNode;
        while (currentNode!=null){
            length++;
            currentNode=currentNode.getNext();
        }
        return length;
    }
    //插入结点
    LinkNode InsertLink(LinkNode headNode,LinkNode nodeToInsert,int position){
        if (headNode==null){
            return nodeToInsert;//若链表为空，插入
        }
        int size=ListLength(headNode);
        if (position>size+1||position<1){
            System.out.println("插入位置错误，");
            return headNode;
        }
        if (position==1){
            nodeToInsert.setNext(headNode);
            return nodeToInsert;
        }else {
            //在链表中间或末尾插入
            LinkNode previousNode=headNode;
            int count=1;
            while (count<position-1){
                previousNode=previousNode.getNext();
                count++;
            }
            LinkNode currentNode=previousNode.getNext();
            nodeToInsert.setNext(currentNode);
            previousNode.setNext(nodeToInsert);
        }
        return headNode;
    }

    //删除结点
    LinkNode DeleteNode(LinkNode headNode,int position){
        int size=ListLength(headNode);
        if (position<1||position>size){
            System.out.println("删除位置错误");
            return headNode;
        }
        if (position==1){
            //删除单向链表的表头结点
            LinkNode currentNode=headNode.getNext();
            headNode=null;
            return currentNode;
        }else {
            LinkNode previousNode=headNode;
            int count=1;
            while (count<position){
                previousNode=previousNode.getNext();
                count++;
            }
            LinkNode currentNode=previousNode.getNext();
            previousNode.setNext(currentNode.getNext());
            currentNode=null;
        }
        return headNode;
    }
    //删除单向链表
    void DeleteLink(LinkNode head){
        LinkNode auxNode,iterator=head;
        while (iterator!=null){
            auxNode=iterator.getNext();
            iterator=null;//在java中，垃圾回收器将自动处理
            iterator=auxNode;//在实际应用中，不需要实现该内容
        }
    }
}
