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

        diary.addEntry("""
                I'm a good friend
                """);
        assertEquals(2, diary.getTotalNumberOfEntry());
    }

}