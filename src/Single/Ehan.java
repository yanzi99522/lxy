package Single;

class Student{
    private Student(){}
    private static final Student s=new Student();
    public static Student getInstance(){
        return s;
    }
}
public class Ehan {
}
