
public class RatioMain {
    public static void main(String[] args) {
        Ratio r = new Ratio(1, 1); // r == 1.0
        r = new Ratio(1, 2); // r == 0.5

        r.add(new Ratio(1, 3)); // sum computed; r == 0.5
        r = r.add(new Ratio(2, 8)); // r == 0.75

        System.out.println(r.getValue()); // 0.75 printed
        System.out.println(r.toString()); // prints 3/4
    }
}