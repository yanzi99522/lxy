package a0717;

/**
 * @author lxy
 */
public class Fanxing {
    class Arrays{
//        public static <T> void swap(T[]array,int i,int j){
//                T temp=array[i];
//                array[i]=array[j];
//                array[j]=temp;
//        }
    }
    public class Entry<K,V>{
        private K key;
        private V value;

        public Entry(K key,V value){
            this.key=key;
            this.value=value;
        }

        public K getKey(){
            return key;
        }
        public V getValue(){
            return value;
        }
    }
    Entry<String ,Integer>entry=new Entry<>("AMY",42);
    public static void main(String[] args) {


    }
}
