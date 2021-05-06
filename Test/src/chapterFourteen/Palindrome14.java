package chapterFourteen;

public class Palindrome14 {


    public boolean isPalindrome(String input){
        //reverse the word
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        //compare the word with the initial
        return reversed.toString().equals(input);
    }
}
