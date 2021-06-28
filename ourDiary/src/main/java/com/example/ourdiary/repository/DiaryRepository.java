package com.example.ourdiary.repository;

import com.example.ourdiary.models.Diary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryRepository extends MongoRepository<Diary, String> {

}
