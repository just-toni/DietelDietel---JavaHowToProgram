package com.example.ourdiary.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
@NoArgsConstructor
public class Diary {
    @Id
    private String diaryId;
    private String title;
    private List<String> entries = new ArrayList<>();
    private User userId;
}
