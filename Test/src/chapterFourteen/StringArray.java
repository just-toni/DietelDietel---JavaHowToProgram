package chapterFourteen;

public class StringArray {

    private String result;

    public static void main(String[] args) {
        String text = "685755465234";
        String text2 = "685755465";
        char[] charArray = new char[text.length()];
        for (int count = text.length() - 4; count >= 0; count--) {
            System.out.printf("%c", text.charAt(count));
        }
    }

    public void reverseString(String input) {
        char [] charArray = new char[input.length()];
        for (int count  = input.length() - 1; count  >= 0 ; count --) {
//            result = ((char) (input.charAt(count)));
            System.out.print(result);
        }
    }

    public String getReservedString() {
        return result;
    }
}
