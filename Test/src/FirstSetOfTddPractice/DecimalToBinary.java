package FirstSetOfTddPractice;

public class DecimalToBinary {

    public int convertInput(int input) {
        String store = "";
        int newInput = input;
        if(input % 2 == 0){
            input = input + 1;
        }
        while (input != 0) {
            int rem = input % 2;
            store = store + rem;
            input = input / 2;
        }
        int num = Integer.parseInt(store);
        store = "";
        while(num != 0){
            int rem = num % 10;
            num = num / 10;
            store = store + rem;
        }
        num = Integer.parseInt(store);
        if (newInput % 2 == 0){
            num = num - 1;
        }
        return num;

    }

}
