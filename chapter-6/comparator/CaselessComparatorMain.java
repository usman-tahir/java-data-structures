
public class CaselessComparatorMain {
    public static void main(String[] args) {
        CaselessComparator c = new CaselessComparator();
        String a = "Hello world";
        String b = "Goodbye world";

        System.out.println(c.compare(a, b)); // 1, since 'G' comes before 'H'
    }
}