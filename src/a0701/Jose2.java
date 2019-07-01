package a0701;

import java.util.Scanner;

/**
 * @author lxy
 */
class LinkList2{
    int no;
    int psw;
    LinkList2 next;

    public LinkList2(int no,int psw){
        this.no=no;
        this.psw=psw;
    }

    public  LinkList2(int no,int psw,LinkList2 next){
        this.no=no;
        this.psw=psw;
        this.next=next;
    }
}
public class Jose2 {
    static LinkList2 head=null,tail=null;
    int size=0;

    public void addhead(int i,int psw){
        head=new LinkList2(i,psw,head);
        if (tail==null){
            tail=head;
        }
        size++;
    }
    public void addtail(int i,int psw){
        tail.next=new LinkList2(i,psw);
        tail=tail.next;
        tail.next=head;
        size++;
    }

    static void CircleFun(LinkList2 list,int m){
        LinkList2 p,q;
        int i;
        q=p=list;
        while (q.next!=p){
            q=q.next;
        }
        System.out.println("游戏者按照如下的顺序出列：");
        while (p.next!=p){
            for (i=0;i<m-1;i++){
                q=p;
                p=p.next;
            }
            q.next=p.next;
            System.out.println("第" + p.no + "个人出列，其手中的出列数字是" + p.psw);
            m=p.psw;
            p=null;
            p=q.next;
        }
        System.out.println("最后一个人是"+p.no+", 其手中的出列数字为"+p.psw);
    }

    public static void main(String[] args) {
        Jose2 LL=new Jose2();
        int e,baoshu;
        System.out.println("复杂约瑟夫环问题求解");
        System.out.println("请输入约瑟夫环中的人数：");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("按照顺序输入每个人手中的出列数字");
        e=in.nextInt();
        LL.addhead(1, e);

        for (int i=2;i<=num;i++){
            e=in.nextInt();
            LL.addtail(i, e);
        }
        System.out.println("请输入第一次出列的数：");
        baoshu=in.nextInt();
        CircleFun(head,baoshu);
    }

}
