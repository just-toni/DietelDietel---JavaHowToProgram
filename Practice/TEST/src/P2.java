public class P2 {

    public static void main(String[] args) {
        int[] toni = {5, 18, 22, 44, 3, 9, 15, 72, 44, 34};

        int sum = 0;
        for (int i = 0; i < toni.length; i++) {
            sum += toni[i];
        }
        System.out.println(sum);
        System.out.println();
        System.out.println(sum/ toni.length);
    }

}
