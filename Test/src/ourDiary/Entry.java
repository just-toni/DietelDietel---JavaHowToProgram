package ourDiary;

import java.time.LocalDateTime;

public class Entry {
    private final LocalDateTime dateAndTimeOfEntry;
    private String entryBody;
    private static int lastEntryId;
    private int entryId;

    public Entry(String entryBody) {
        this.entryBody = entryBody;
        dateAndTimeOfEntry = LocalDateTime.now();
        entryId = ++lastEntryId;
    }
}
