package chapterFifteen.FileMatching;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.Format;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFiles {

    private static Scanner textFileInput;
    private static Scanner textFileInput2;
    File file = new File("newmast.txt");
    private static Formatter output;

    public static void main(String[] args) {
        openFile();
        readRecordsFromMasterFile();
        closeFile();
    }

    private static void openFile() {
        try{
//            System.out.println("Enter a text file name.");
            textFileInput = new Scanner(Paths.get("oldmast.txt"));
            textFileInput2 = new Scanner(Paths.get("trans.txt"));
        }
        catch(IOException ioException)
        {
            System.err.println(ioException.getMessage());
            System.exit(1);
        }
    }

    private static void readRecordsFromMasterFile(){
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First name",
                "Last name", "Balance");
            try {
                while (textFileInput.hasNext()) {
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", textFileInput.nextInt(),
                            textFileInput.next(), textFileInput.next(), textFileInput.nextDouble());

                }
            }
            catch(NoSuchElementException | IllegalStateException elementException){
                System.err.println(elementException.getMessage());
            }
        System.out.printf("%-10s%10s%n", "Account", "Amount");
            try {
                while(textFileInput2.hasNext()){
                    System.out.printf("%-10d%10.2f%n", textFileInput2.nextInt(),
                            textFileInput2.nextDouble());
                }
            }
            catch(NoSuchElementException | IllegalStateException elementException){
                System.err.println(elementException.getMessage());
            }
        if(textFileInput.hasNextInt() == textFileInput2.hasNextInt()){
            double balance = textFileInput.nextDouble() + textFileInput2.nextDouble();
            Scanner scanner = new Scanner("newmast.txt");
            while(scanner.hasNext()){
                try{
                    output.format("%.2f", balance);
                }
                catch(FormatterClosedException formatterClosedException){
                    System.err.println(formatterClosedException.getMessage());
                    break;
                }
                catch(NoSuchElementException noSuchElementException){
                    System.err.println(noSuchElementException.getMessage());
                    scanner.nextLine();
                }
            }
        }
    }

    private static void closeFile(){
        if(textFileInput != null)
            textFileInput.close();
        if(textFileInput2 != null)
            textFileInput2.close();
    }

}
