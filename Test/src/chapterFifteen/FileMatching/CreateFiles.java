package chapterFifteen.FileMatching;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateFiles {

    private static Formatter output;

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    private static void openFile() {
        Scanner textFileInput = new Scanner(System.in);
        try{
            System.out.println("Enter a text file name.");
            output = new Formatter(textFileInput.next());
        }
        catch(SecurityException | FileNotFoundException securityException)
        {
            System.err.println(securityException.getMessage());
            System.exit(1);
        }
    }

    private static void addRecords(){
        Scanner record = new Scanner(System.in);
        System.out.printf("%s%n%s%n",
                "Enter account number, first name, last name and balance",
                "Enter end-of-file indicator to end input");
        while(record.hasNext()){
            try{
                output.format("%d %s %s %.2f %n", record.nextInt(),
                        record.next(), record.next(), record.nextDouble());
            }
            catch(FormatterClosedException formatterClosedException){
                System.err.println(formatterClosedException.getMessage());
                break;
            }
            catch(NoSuchElementException noSuchElementException){
                System.err.println(noSuchElementException.getMessage());
                record.nextLine();
            }
            System.out.println("? ");
        }
    }

    private static void closeFile(){
        if(output != null)
            output.close();
    }

}
