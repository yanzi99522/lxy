package thread;

class Myrunnable implements Runnable{
    private int i=0;
    @Override
    public void run(){
        for(i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
public class RunnableThread {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            if(i==2){
                Runnable Myrunnable=new Myrunnable();
                Thread thread1=new Thread(Myrunnable);
                Thread THREAD2 = new Thread(Myrunnable);
                THREAD2.start();
                thread1.start();
            }
        }
    }
}
