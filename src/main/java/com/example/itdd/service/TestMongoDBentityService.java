package com.example.itdd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.itdd.EntityRepository.TestEntityRepository;
import com.example.itdd.entity.TestEntity;

@Service
public class TestMongoDBentityService {

    @Autowired
    private TestEntityRepository testMongoDBentity;

    public TestEntity saveEntity(TestEntity entity) {
        return testMongoDBentity.save(entity);
    }

    public TestEntity findByName(String name) {
        return testMongoDBentity.findByName(name);
    }

    public  List<TestEntity> selectAll() {
        return testMongoDBentity.findAll();
    }
    // 其他 CRUD 操作
}
