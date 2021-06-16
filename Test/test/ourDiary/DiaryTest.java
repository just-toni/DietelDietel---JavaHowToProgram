package ourDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @Test
    void diaryHasAnEntry_test(){
        Diary diary = new Diary();
        String message = "Today went okay, I went to eat and buy things for the summer.";
        Entry entry = new Entry(message);
        diary.newEntry(entry);
        assertEquals(1, diary.getTotalNumberOfEntries());
    }

    @Test
    void diaryCanHaveMultipleEntries_test(){
        Diary diary = new Diary();
        Entry entry = new Entry("Today went okay, I went to eat and buy things for the summer.");
        Entry entry2 = new Entry("I slept throughout the day");
        diary.newEntry(entry);
        diary.newEntry(entry2);
        assertEquals(2, diary.getTotalNumberOfEntries());
    }

    @Test
    void diaryCanAccessEntryThroughEntryId_test(){
        Diary diary = new Diary();
        String message = "Today went okay, I went to eat and buy things for the summer.";
        Entry entry = new Entry(message);
        diary.newEntry(entry);
        int entryId = entry.getEntryId();
        assertEquals(message, diary.getEntryMessage(entryId));
        assertEquals(1, diary.getTotalNumberOfEntries());
    }

    @Test
    void diaryCanAccessAllEntries_test(){
        Diary diary = new Diary();
        Entry entry = new Entry("Today went okay, I went to eat and buy things for the summer.");
        Entry entry2 = new Entry("I slept throughout the day");
        diary.newEntry(entry);
        diary.newEntry(entry2);
        String firstEntry = entry.toString();
        String secondEntry = entry2.toString();
        String allEntries = firstEntry + "\n\n" + secondEntry + "\n\n";
        assertEquals(allEntries, diary.viewAllEntries());
        System.out.println(diary.viewAllEntries());
    }
}