package Single;

class Student2{
    private Student2(){}
    private static final Student2 s2=null;
    public static Student2 getInstance(){
        if(s2==null){
            //线程1就进来了，线程2就进来了
             Student2 s2 = new Student2();
        }
        return s2;

    }
}
public class Baohan {
}
