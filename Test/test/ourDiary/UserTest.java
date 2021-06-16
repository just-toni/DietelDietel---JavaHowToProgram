package ourDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    Diary diary;
    User joy;

    @BeforeEach
    void setUp() {
        diary = new Diary();
        joy = new User("Joy", diary);
    }

    @AfterEach
    void tearDown() {
        diary = null;
        joy = null;
    }

    @Test
    void userHasDiary_test(){
        assertNotNull(joy.getDiary());
    }

    @Test
    void userCanWriteInDiary_test(){
        String message = "Today is a new day";
        Entry entry = new Entry(message);
        joy.write(entry);
        int entryId = entry.getEntryId();
        assertEquals(message, joy.getDiary().getEntryMessage(entryId));
    }

    @Test
    void userCanUpdateDiaryEntry_test(){
        String message = "Today is a new day";
        Entry entry = new Entry(message);
        joy.write(entry);
        int entryId = entry.getEntryId();
        String newMessage = "It rained again today";
        joy.updateEntry(entryId, newMessage);
        assertEquals(newMessage, joy.getDiary().getEntryMessage(entryId));
    }

    @Test
    void userCanDeleteEntry_test(){
        String message = "Today is a new day";
        Entry entry = new Entry(message);
        joy.write(entry);
        int entryId = entry.getEntryId();
        assertEquals(message, joy.getDiary().getEntryMessage(entryId));
        joy.delete(entryId);
        assertEquals(0, joy.getTotalNumberOfEntries());
    }

    @Test
    void userCanViewAllEntries_test(){

    }

}