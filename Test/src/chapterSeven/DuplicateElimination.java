package chapterSeven;

public class DuplicateElimination {
    private static int[] array = new int [4];
    private static int input;

    public static void checkInput(int input) {
//        DuplicateElimination.input = input;
        boolean isValid = input >= 10 && input <= 100;
        for (int i = 0; i < array.length; i++) {
            if(!isValid){
                throw new IllegalArgumentException("Number must be between 10 and 100 inclusive");
            }
            else if (input == array[i]){
                throw new IllegalArgumentException("Number has been entered before");
            }
            else if (array[i] == 0){
                array[i] = input;
                break;
            }
        }
    }


    public static String displayUniqueInputs() {
        String uniqueInput = "";
        for(int number : array){
            uniqueInput += number + ", ";
        }
        return uniqueInput;
    }
}
