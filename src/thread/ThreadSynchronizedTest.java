package thread;

public class ThreadSynchronizedTest {
    public static void main(String[] args) {
        final SynchronizeOutputer synoutput=new SynchronizeOutputer();
        new Thread(){
            public void run(){
                System.out.println("乱啦！乱啦！");
            };
        }.start();

        new Thread(){
            public void run(){
                System.out.println("线程应该是属于信息的");;
            };
        }.start();
    }
}
class SynchronizeOutputer{
    public void SynchronizeOutputer(String name){
        for (int i=0;i<name.length();i++){
            System.out.print(name.charAt(i));
        }
    }
}
