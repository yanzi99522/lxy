package thread;

 class MyThread1 extends Thread {
    private int i=0;
    @Override
    public void run(){
        for (i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
public class MyThread{
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if (i==30){
                Thread thread1=new MyThread1();
                Thread THREAD2=new MyThread1();
                thread1.start();
                THREAD2.start();
            }
        }
    }

}
