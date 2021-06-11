package ourDiary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @Test
    void entryCanBeAdded(){
        Diary diary = new Diary();
        diary.addEntry("""
                I'm a good person.
                """);
        assertEquals(1, diary.getTotalNumberOfEntry());
    }

    @Test
    void multipleEnteriesCanBeAdded(){
        Diary diary = new Diary();
        diary.addEntry("""
                I'm a good friend
                """);
        diary.addEntry("""
                I bought clothes for my sister
                """);
        assertEquals(2, diary.getTotalNumberOfEntry());
    }

}