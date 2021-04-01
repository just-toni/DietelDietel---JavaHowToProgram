public class BarChart {

    private int[] array;

    public void setArray(int[] array){
//        for (int i = 0; i < array.length; i++) {
//
//        }
        this.array = array;
    }

    public int[] getArray(){
        return array;
    }

    public void displayAsterisks(int input){
            for(int counter = 0; counter < input; counter++){
                System.out.print("* ");
            }
        }

    public void printBarChart(){
        for (int i = 0; i < getArray().length; i++) {
            displayAsterisks(getArray()[i]);
            System.out.println();
        }
    }

}
