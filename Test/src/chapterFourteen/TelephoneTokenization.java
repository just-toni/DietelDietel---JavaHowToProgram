package chapterFourteen;

public class TelephoneTokenization {
    public static String changeNumber(String phoneNumber) {
        String[] firstSplit = phoneNumber.split("[(]");
        String[] secondSplit = firstSplit[1].split("-");
        StringBuilder newNumber = new StringBuilder();
        newNumber.append(secondSplit[0]).append(secondSplit[1]);
        String[] thirdSplit = newNumber.toString().split("[) ]");

        //for (int i = 0; i < secondSplit.length; i++) {
            newNumber.append(thirdSplit[0]).append(thirdSplit[2]);
       // }
        return thirdSplit[0] + thirdSplit[2];
    }
}
