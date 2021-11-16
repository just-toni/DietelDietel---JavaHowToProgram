package chapterFifteen.FileMatching;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFiles {

    private static Scanner textFileInput;


    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    private static void openFile() {
        try{
//            System.out.println("Enter a text file name.");
            textFileInput = new Scanner(Paths.get("oldmast.txt"));
        }
        catch(IOException ioException)
        {
            System.err.println(ioException.getMessage());
            System.exit(1);
        }
    }

    private static void readRecords(){
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First name",
                "Last name", "Balance");
            try {
                while (textFileInput.hasNext()) {
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", textFileInput.nextInt(),
                            textFileInput.next(), textFileInput.next(), textFileInput.nextDouble());
                }
            }
            catch(NoSuchElementException elementException){
                System.err.println(elementException.getMessage());
            }
            catch(IllegalStateException illegalStateException){
                System.err.println(illegalStateException.getMessage());
            }
    }

    private static void closeFile(){
        if(textFileInput != null)
            textFileInput.close();
    }

}
