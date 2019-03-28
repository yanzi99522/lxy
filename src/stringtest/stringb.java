package stringtest;

public class stringb {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("hello");
        stringBuilder1.append(" world");
        System.out.println(stringBuilder1);
        stringBuilder1.append('\t').append('C');
        System.out.println(stringBuilder1);
        stringBuilder1.insert(3,"JAVA");
        System.out.println(stringBuilder1);
    }
}
