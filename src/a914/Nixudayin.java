package a914;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author lxy
 */
public class Nixudayin {
    class listnode{
        int val;
        listnode next;
    }
    public ArrayList<Integer> Zhan(listnode listnodez){
        Stack<Integer>stack=new Stack<>();
        while (listnodez!=null){
            stack.add(listnodez.val);
            listnodez=listnodez.next;
        }
        ArrayList<Integer> list = new ArrayList();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
    public ArrayList Touchafa(listnode listnode2){
        //头插法构建逆序链表
        listnode head=new listnode();
        while (listnode2!=null){
            listnode memo=listnode2.next;
            listnode2.next=head.next;
            head.next=listnode2;
            listnode2=memo;
        }
        //构建ArrayList
        ArrayList<Integer> arrayList=new ArrayList<>();
        head=head.next;
        while (head!=null){
            arrayList.add(head.val);
            head=head.next;
        }
        return arrayList;
    }
    static ArrayList nixu(listnode listnode1){

        ArrayList list=new ArrayList();
        if (listnode1!=null){
            list.addAll(nixu(listnode1.next));
            list.add(listnode1.val);
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        System.out.println(arrayList);
        System.out.println("逆序输出：");

    }
}
