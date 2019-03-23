package thread;

public class VolatileTest {
    private volatile int inc=0;

    public static void main(String[] args) {
        final VolatileTest volatileTest1=new VolatileTest();
        for (int i=0;i<20;i++){
            new Thread(){
                @Override
                public void run(){
                    try{
                        Thread.sleep(1);
                        volatileTest1.inc();
                    }catch (Exception e){
                }
            }
        }.start();
    }
        while (Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(volatileTest1.inc);
}
private void inc(){
    inc++;
    }
}
