package DataStructureBook.shujujiegou;

class DATA22{
    String key;
    String name;
    int age;
}

class LLType{
    DATA22 nodeData=new DATA22();
    LLType nextNode;

    LLType LLAddEnd(LLType head,DATA22 nodeData){
        LLType node,htemp;
        if ((node=new LLType())==null){
            System.out.println("申请内存失败！");
            return null;
        }
        else {
            node.nodeData=nodeData;
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
            return head;
        }
    }
}

public class LLINK {

}
