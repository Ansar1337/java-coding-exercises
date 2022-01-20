package exercise5;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(isEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(isEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(isEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean isEqualByThreeDecimalPlaces(double a, double b) {
        return (int) (a * 1000) == (int) (b * 1000);
    }
}