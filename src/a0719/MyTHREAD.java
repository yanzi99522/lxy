package a0719;

/**
 * @author lxy
 */
class MyThread implements Runnable{
    //创建线程类
    public void run(){
        System.out.println("Thread body.");
    }

}
public class MyTHREAD {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        Thread thread1=new Thread(thread);
        thread1.start();//开启线程
    }
}
