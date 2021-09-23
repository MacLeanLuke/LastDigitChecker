public class Main {
    public static void main(String[] args) {
        System.out.println("41 and 22 and 71 share the right most digit: " + LastDigitChecker.hasSameLastDigit(41,22,71));
        System.out.println("23 and 32 and 42 share the right most digit: " + LastDigitChecker.hasSameLastDigit(23,32,42));
        System.out.println("9 and 99 and 999 share the right most digit: " + LastDigitChecker.hasSameLastDigit(9,99,999));
        System.out.println("42 and 23 and 54 share the right most digit: " + LastDigitChecker.hasSameLastDigit(42,23,54));
    }
}
