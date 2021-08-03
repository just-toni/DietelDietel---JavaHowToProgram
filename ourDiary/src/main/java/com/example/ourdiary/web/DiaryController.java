package com.example.ourdiary.web;

import com.example.ourdiary.models.Diary;
import com.example.ourdiary.services.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DiaryController {

    @Autowired
    private DiaryService diaryService;
    @PostMapping("/diary/{title}")
    public Diary createDiary(@PathVariable ("title") String title){
        Diary diary = new Diary();
        diary.setTitle(title);
        return diaryService.save(diary);
    }

    @DeleteMapping("/diary/delete/{title}")
    public void deleteDiary(@RequestParam("title") String title){
        diaryService.delete(title);
    }

}
