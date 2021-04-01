import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListPracticeTest {


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test1(){
        List<String> unknown = new ArrayList<>();
        unknown.add("idk");
        unknown.add("hte");
        unknown.add("trw");
        for (String s : unknown) {
            System.out.println(s);
        }
    }
}