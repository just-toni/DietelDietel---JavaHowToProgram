package luhnCreditCardValuation;

public class LuhnCreditValuation {

    private static int sumDoubleEvenPlaces(String cardNumber) {
        int sum = 0;
        for (int i = cardNumber.length() - 2; i >= 0; i-=2) {
            sum+= getDigits((cardNumber.charAt(i)));
        }
        System.out.println(sum);
        return sum;
    }

    private static int getDigits(int character) {
        int tempSum = 2 * Character.getNumericValue(character);
        if(tempSum < 10) {
//            System.out.println(tempSum);
            return tempSum;
        }
        else
//            System.out.println(tempSum);
            return (tempSum / 10) + (tempSum % 10);
    }

    private static int sumOfOddPlaces(String cardNumber){
        int sum = 0;
        for (int i = cardNumber.length() - 1; i >= 0; i-=2) {
            sum+= Character.getNumericValue(cardNumber.charAt(i));
        }
        System.out.println(sum);
        return sum;
    }

    public static boolean isValid(String cardNumber) {
        return ((sumDoubleEvenPlaces(cardNumber) + sumOfOddPlaces(cardNumber)) % 10 == 0);
    }
}
