package ourDiary;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private List<Entry> entries = new ArrayList<>();

    public void newEntry(Entry entry) {
        entries.add(entry);
    }

    public int getTotalNumberOfEntries() {
        return entries.size();
    }

    public void updateEntry(int entryId, String message) {
        for (int i = 0; i < entries.size(); i++) {
            if(entries.get(i).getEntryId() == entryId){
                entries.get(i).updateMessage(message);
                break;
            }
        }
    }

    public String getEntryMessage(int entryId) {
        String result = "";
        for (int i = 0; i < entries.size(); i++) {
            if(entries.get(i).getEntryId() == entryId){
                result = entries.get(i).getMessage();
                break;
            }
        }
        return result;
    }

    public void deleteEntry(int entryId) {
        for (int i = 0; i < entries.size(); i++) {
            if(entries.get(i).getEntryId() == entryId){
                entries.remove(i);
                break;
            }
        }
    }


    public String viewAllEntries() {
        String allEntries = "";
        for (int i = 0; i < entries.size(); i++) {
            allEntries += entries.get(i).toString() + "\n\n";
        }
        return  allEntries;

    }
}
