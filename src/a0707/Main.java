package a0707;


import java.util.Stack;

/**
 * @author lxy
 */
public class Main {//栈
    static  String[] months={"a","b","c","d","e","f","g","h","i","j","k"};

    public static void main(String[] args) {
        Stack stack=new Stack();
//        Vector vector=new Vector();
        for (int i=0;i<months.length;i++){
            stack.push(months[i]+"");
        }
        System.out.println("stack=" + stack);
        stack.addElement("The last line");
        System.out.println("element 5=" + stack.elementAt(5));
        System.out.println("poping elements:");
        while (!stack.empty()){
            System.out.print(" "+stack.pop());
        }
    }
}
