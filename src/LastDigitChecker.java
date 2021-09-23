public class LastDigitChecker {
    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree){
        if (numOne < 10 || numOne > 1000 || numTwo < 10 || numTwo > 1000 || numThree < 10 || numThree > 1000){
            return false;
        }
        int digitOne = numOne % 10;
        int digitTwo = numTwo % 10;
        int digitThree = numThree % 10;

        if (digitOne == digitTwo || digitOne == digitThree || digitTwo == digitThree){
            return true;
        }
        return false;
    }
    public static boolean isValid(int number){
        if (number < 10 || number > 1000){
            return false;
        }
        return true;
    }
}
