package a0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author lxy
 */
public class MainL {
    public static void main(String[] args)throws Exception {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,String >hashMap=new HashMap<>();
        hashMap.put("reset", "reset what");
        hashMap.put("reset board", "board fault");
        hashMap.put("board add", "where to add");
        hashMap.put("board delet", "no board at all");
        hashMap.put("reboot backplane", "impossible");
        hashMap.put("backplane abort", "install first");

        String string=bufferedReader.readLine();
        while (string!=null){
            if (hashMap.containsKey(string)){
                System.out.println(hashMap.get(string));
            }else {
                System.out.println("unkown command");
            }
            string=bufferedReader.readLine();
        }
    }
}
