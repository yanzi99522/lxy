package a0708;

/**
 * @author lxy
 */
public class Main {
    public static void main(String[] args) {
        String string="2019-07-08 08:33:45";
        String string2="";
        String[]RESULT=string.split("\\D");
        for (int i=0;i<RESULT.length;i++){
            System.out.println(RESULT[i]);
            string2+=RESULT[i];
        }
        System.out.println(string2);
    }



}
