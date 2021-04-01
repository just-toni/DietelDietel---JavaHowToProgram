import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarChartTest {
BarChart barChart;

    @BeforeEach
    void setUp() {
        barChart = new BarChart();
    }

    @AfterEach
    void tearDown() {
        barChart = null;
    }

    @Test
    void setArray() {
        int [] array = {1,2,3,4,5,0,1,3,2,5};
        barChart.setArray(array);
        assertArrayEquals(new int []{1,2,3,4,5,0,1,3,2,5}, barChart.getArray());
    }

}