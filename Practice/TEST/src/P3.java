public class P3 {

    public static void main(String[] args) {
        int [] differ = new int[20];

//        for (int i = 0; i < differ.length; i++) {
//            System.out.print(differ[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < differ.length; i++) {
//            differ[i] = i + 1;
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < differ.length; i++) {
//            if(differ[i] % 2 == 0){
//                System.out.print(i + " ");
//            }
//        }

        for(int numbers : differ){
            System.out.print(numbers +" ");
        }
        System.out.println();
        int counter = 1;
        for(int items : differ){
            items = counter;
            counter++;
            System.out.print(items + " ");
        }
    }

}
