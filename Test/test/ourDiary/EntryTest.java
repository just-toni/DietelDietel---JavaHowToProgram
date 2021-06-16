package ourDiary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {

    @Test
    void entryHasAMessage_test(){
        String message = "Hello i'm your new user";
        Entry entry = new Entry(message);
        assertEquals(message, entry.getMessage());
    }

    @Test
    void entryHasAnId_test(){
        String message = "Hello i'm your new user";
        Entry entry = new Entry(message);
        assertEquals(message, entry.getMessage());
        assertEquals(1, entry.getEntryId());
        String message2 = "We will be friends for as long as you have blank pages";
        Entry entry2 = new Entry(message2);
        assertEquals(2, entry2.getEntryId());
    }

    @Test
    void entryCanBeUpdated_test(){
        String message = "Hello i'm your new user";
        Entry entry = new Entry(message);
        assertEquals(message, entry.getMessage());
        String newMessage = "Hello I'm Toni, your new user";
        entry.updateMessage(newMessage);
        assertEquals(newMessage, entry.getMessage());
    }
}