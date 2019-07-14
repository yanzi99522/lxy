package a0712;

import java.util.ArrayList;
import java.util.List;

/**输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，
 * 输出两个数的乘积最小的。
 输出描述:
 对应每个测试案例，输出两个数，小的先输出。
 * @author lxy
 */
public class Find2 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
      ArrayList<Integer> list=new ArrayList<>();
      if (array==null||array.length<2){
          return list;
      }

      int i=0,length=array.length-1;
      while (i<length){
          if (array[i]+array[length]==sum){
              list.add(array[i]);
              list.add(array[length]);
              return list;
          }else if (array[i]+array[length]>sum){
              length--;
          }else {
              i++;
          }
      }
      return list;

    }

    public static void main(String[] args) {
        Find2 find2=new Find2();
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int array[]={1,2,3,4,5,6,7,8};
//        find2.FindNumbersWithSum(array,20);

        System.out.println(find2.FindNumbersWithSum(array,20));

    }
}
