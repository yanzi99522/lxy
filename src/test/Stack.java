package test;
//栈结构

class DATA3{
    String key;
    String name;
    int age;
}

class StackType{
    static final int MAXLEN=50;
    DATA3[] data=new DATA3[MAXLEN];
    int top;

    StackType STInit(){
        StackType p;
        if ((p=new StackType())!=null){
            p.top=0;
            return p;
        }
        return null;
    }

    boolean STIsEmpty(StackType s){
        boolean t;
        t=(s.top==MAXLEN);
        return t;
    }

    void STClear(StackType s){
        s.top=0;
    }

    boolean STCIsFull(StackType s){
        boolean t;
        t=(s.top==MAXLEN);
        return t;
    }



}
public class Stack {
}
