package ourDiary;

public class User {
    private String username;
    private Diary diary;

    public User(String username, Diary diaryName) {
        this.username = username;
        this.diary = diaryName;
    }

    public int getTotalNumberOfEntries() {
        return diary.getTotalNumberOfEntries();
    }

    public Diary getDiary() {
        return diary;
    }

    public void write(Entry entry) {
        diary.newEntry(entry);
    }

    public void updateEntry(int entryId, String message) {
        diary.updateEntry(entryId, message);
    }


    public void delete(int entryId) {
        diary.deleteEntry(entryId);
    }
}
