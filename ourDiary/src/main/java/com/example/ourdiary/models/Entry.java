package com.example.ourdiary.models;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Document
public class Entry {
    @Id
    private String entryId;
    private String entryBody;
    private String entryTitle;
    private LocalDateTime entryTime;

}
