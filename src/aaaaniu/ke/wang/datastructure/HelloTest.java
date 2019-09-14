package aaaaniu.ke.wang.datastructure;

public class HelloTest {
    public void dispASCII(char x){
        int xt=(int)x;
        System.out.println("zifu"+x+"的ASCII码是："+xt);
    }
    public static void main(String[] args) {
        HelloTest obj=new HelloTest();
        obj.dispASCII('s');
        obj.dispASCII('2');
        obj.dispASCII('\\');
    }
}
