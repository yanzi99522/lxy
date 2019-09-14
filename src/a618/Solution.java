package a618;

/**
 * @author lxy
 */
public class Solution {
    static int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        while(n>0){
            String s=String.valueOf(n);
            char[] chars=s.toCharArray();
            for(int i=0;i<chars.length;i++){
                if(chars[i]=='1'){
                    count++;
                }
            }
            n--;
        }

        return count;
    }

    public static void main(String[] args) {
        Solution test=new Solution();
       int a=NumberOf1Between1AndN_Solution(1300);
        System.out.println(a);

    }
}
