package com.example.ourdiary.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Document("Users")
public class User {
    @Id
    private int userId;
    private String userName;
    private String password;
    private List<Diary> diaries = new ArrayList<>();
}
