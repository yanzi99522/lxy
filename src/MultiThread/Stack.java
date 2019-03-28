package MultiThread;
//堆栈类
public class Stack {
    //堆栈指针初始值为0
    private int pointer=0;
    //堆栈有5个字符的空间
    private char[] data=new char[5];
    //压栈方法，加上互斥锁
    public synchronized void push(char c){
        //堆栈已经满，不能压栈
        while (pointer==data.length){
            try{
                //等待，知道有数据出栈
                this.wait();
            }catch (InterruptedException e){

            }
        }
        //通知其他线程把数据出栈
        this.notify();
        //数据压栈
        data[pointer]=c;
        //指针向上移动
        pointer++;
    }

    //出栈方法，加上互斥锁
    public synchronized char pop(){
        //堆栈无数据，不能出栈
        while (pointer==0){
            try {
                //等待其他线程把数据压栈
                this.wait();
            }catch (InterruptedException e){

            }
        }
        //通知其他线程压栈
        this.notify();
        //指针向下移动
        pointer--;
        //数据出栈
        return data[pointer];
    }
}
