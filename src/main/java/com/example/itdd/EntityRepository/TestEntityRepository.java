package com.example.itdd.EntityRepository;



import com.example.itdd.entity.TestEntity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestEntityRepository extends MongoRepository<TestEntity, Integer>{
    
    TestEntity findByName(String name);


}
