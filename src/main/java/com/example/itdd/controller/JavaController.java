package com.example.itdd.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.itdd.entity.TestEntity;
import com.example.itdd.service.TestMongoDBentityService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Tag(name = "product api")
@RestController
public class JavaController {
    
@Autowired
TestMongoDBentityService testMongoDBentityService;

    @Operation(summary = "UUID")
    @Parameter(name = "產生UUID", description = "隨機產生一組不諱重複的字串", required = false, in = ParameterIn.QUERY, schema = @Schema(type = "string"))
  @PostMapping("/UUID")
  public String UUID() throws UnsupportedEncodingException, InterruptedException {

    java.util.UUID uuid = java.util.UUID.randomUUID();

    return uuid.toString();

  }

  /**
   * @return
   * @throws UnsupportedEncodingException
   * @throws InterruptedException
   */
  @Operation(summary = "測試MONGODB")
  @Parameter(name = "testMongoDB", description = "...", required = false, in = ParameterIn.QUERY, schema = @Schema(type = "string"))
@PostMapping("/testMongoDB")
public TestEntity testMongoDB() throws UnsupportedEncodingException, InterruptedException {

  TestEntity testEntity = new TestEntity();

  testEntity.setId(2);
  testEntity.setAge(18);
  testEntity.setName("JJ");

  testMongoDBentityService.saveEntity(testEntity);

  return   testMongoDBentityService.findByName("eric");

}
@Operation(summary = "所有")
@PostMapping("/testMongoDBAll")
public List<TestEntity> testMongoDBAll() throws UnsupportedEncodingException, InterruptedException {

 

  

  return   testMongoDBentityService.selectAll();

}
}
