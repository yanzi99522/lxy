package a0706;

/**
 * @author lxy
 */
public class MainTEST {
    public static void main(String[] args) {
        int n=2;
        int res=1;
        while( (getonly(n)+res)!=n){
            res += getonly(n);
            ++n;
        }
        System.out.println(n);


    }
    static int getonly(int num){
        int number=0;
        String s=num+"";
        int length=s.length();
        if (length!=0){
            for (int i=0;i<length;i++){
                char a=s.charAt(i);
                if (a=='1'){
                    number++;
                }
            }
        }return  number;
    }
}
