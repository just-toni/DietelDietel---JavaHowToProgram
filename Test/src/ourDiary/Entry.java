package ourDiary;

import java.time.LocalDateTime;

public class Entry {

    private static int lastEntryId;
    private String message;
    private int entryId;
    private LocalDateTime timeOfEntry;

    public Entry(String message) {
        this.message = message;
        entryId = ++lastEntryId;
        timeOfEntry = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public int getEntryId() {
        return entryId;
    }

    public void updateMessage(String newMessage) {
        this.message = newMessage;
    }

    public LocalDateTime getTimeOfEntry() {
        return timeOfEntry;
    }

    @Override
    public String toString() {
        return "Entry {" + '\n' + "Entry ID: " + entryId + '\n' +
                "Message: " + message + '\n' + "Time of Entry: " +
                timeOfEntry + '\n' + "}";
    }
}
