package chapterSeven;

public class ExerciseSevenPointEight {

    public static void main(String[] args) {
        int [] f = new int[10];
        System.out.println(f[6] + " ");
        System.out.println();

        int [] g = new int [5];
        for(int i = 0; i < g.length; i++){
            g[i] = 5;
            System.out.print(g[i] + " ");
        }

        System.out.println();
        double [] c = new double [100];
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += c[i];
        }
        System.out.println(sum);
        System.out.println();

        int [] b = new int[34];
        int [] a = new int [11];
        for (int i = 0; i < a.length; i++) {
                a[i] = i + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        int [] w = new int [99];
        int min = w[0];
        int max = w[0];
        for (int i = 0; i < w.length; i++) {
            w[i] = i + 1;
            System.out.print(w[i] + " ");
            min = Math.min(w[i], min);
            max = Math.max(w[i], max);
        }
        System.out.println(min);
        System.out.println(max);
    }

}
