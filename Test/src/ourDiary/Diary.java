package ourDiary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    List<String> entries = new ArrayList<>();
    public void addEntry(String entryBody) {
//        Entry entry = new Entry(entryBody);
        entries.add(entryBody);
    }

    public int getTotalNumberOfEntry() {
        return entries.size();
    }

    public void deleteEntry(int entryNumber) {
//        Entry entry = findEntryBy(entryNumber);
//        entries.remove(entry);
    }

//    private Entry findEntryBy(int entryNumber) {
//        for (int i = 0; i < entries.size(); i++) {
//            if(entries.getEntryNumber().equals(entryNumber)){
//                return en
//            }
//        }
//    }
}
