package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatTest {

    DateFormat dateFormat = new DateFormat();

    @Test
    void covertDateTest(){
        String date = "04/25/1955";
        dateFormat.convertDate(date);
    }

}