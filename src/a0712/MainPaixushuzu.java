package a0712;

/**统计一个数字在排序数组中出现的次数。
 * @author lxy
 */
public class MainPaixushuzu {
    public int GetNumberOfK(int [] array , int k) {
       int count=0;
       for (int i=0;i<array.length;i++){
           if (array[i]==k){
               count++;
           }
       }
       return count;


    }
    public static void main(String[] args) {
        int array[]={1,2,3,3,4,5,6};
        MainPaixushuzu M=new MainPaixushuzu();
        int n=M.GetNumberOfK(array,3);
        System.out.println(n);

    }
}
