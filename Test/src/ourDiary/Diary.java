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
}
