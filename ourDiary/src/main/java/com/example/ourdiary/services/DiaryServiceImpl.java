package com.example.ourdiary.services;

import com.example.ourdiary.models.Diary;
import com.example.ourdiary.repository.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaryServiceImpl implements DiaryService{
    @Autowired
    private DiaryRepository diaryRepository;

    public Diary save(Diary diary){
        return diaryRepository.save(diary);
    }
    
    public void delete(String ttile) {
        diaryRepository.deleteById(title);
    }


}
