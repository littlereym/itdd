package com.example.itdd.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.io.UnsupportedEncodingException;

@Tag(name = "product api")
@RestController
public class JavaController {
    
    @Operation(summary = "UUID")
    @Parameter(name = "產生UUID", description = "隨機產生一組不諱重複的字串", required = false, in = ParameterIn.QUERY, schema = @Schema(type = "string"))
  @PostMapping("/UUID")
  public String UUID() throws UnsupportedEncodingException, InterruptedException {

    java.util.UUID uuid = java.util.UUID.randomUUID();

    return uuid.toString();

  }

  
}
