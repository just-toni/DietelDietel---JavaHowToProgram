package ourDiary;

public class User {

    private final String userName;
    private final Diary diary;

    public User(String userName, Diary userDiary) {
        diary = userDiary;
        this.userName = userName;
    }

    public Diary getDiary(){
        return diary;
    }

    public void createEntry(String entryBody) {
        diary.addEntry(entryBody);
    }

    public void updateEntry(String entryBody) {
        diary.addEntry(entryBody);
    }

    public int getTotalEntries() {
        return diary.getTotalNumberOfEntry();
    }

    public void delete(int entryNumber) {
        diary.deleteEntry(entryNumber);
    }
}
