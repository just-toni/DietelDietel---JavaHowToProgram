package business.toni.mydiary.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Entry {

    private String message;
    private int entryId;
    private LocalDateTime timeOfEntry;

}
