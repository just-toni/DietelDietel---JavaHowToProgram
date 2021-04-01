import java.util.Scanner;

public class BarChartMain {

    public static void main(String[] args) {
        BarChart barChart = new BarChart();

        int [] array = {1,2,0,3,1,4,5,2,1,4};
        barChart.setArray(array);

        barChart.printBarChart();
    }

}
