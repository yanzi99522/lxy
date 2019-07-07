package a0707;

/**
 * @author lxy
 */
public class Main2 {//截取字符串
    public static void main(String[] args) {
        String s="中国A我";
        byte[] b="s".getBytes();
        A(s,4);


    }

    public static  void A(String s,int i){
        byte b[]=new byte[1024];
        int num=0;
        b=s.getBytes();
        if(b[i-1]>0){
            System.out.println(new String(b,0,i));
        }else {
            for (int j=0;j<i;j++){
                if (b[j]<0){
                    num++;
                    num=num%2;
                }else {
                    num=0;
                }
            }
            if (num==0){
                System.out.println(new String(b,0,i));
            }else {
                System.out.println(new String(b,0,i-1));
            }
        }
    }
}
