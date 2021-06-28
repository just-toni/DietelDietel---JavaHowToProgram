package com.example.ourdiary.services;

import com.example.ourdiary.models.Diary;
import org.springframework.stereotype.Service;

@Service
public interface DiaryService {

    Diary save(Diary diary);

    void delete(String title);

}
