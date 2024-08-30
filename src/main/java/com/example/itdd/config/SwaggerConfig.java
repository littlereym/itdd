// package com.example.itdd.config;

// import org.springdoc.core.GroupedOpenApi;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import springfox.documentation.builders.ApiInfoBuilder;
// import springfox.documentation.builders.PathSelectors;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.service.ApiInfo;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spring.web.plugins.Docket;


// @Configuration
// public class SwaggerConfig {

 

//     //  @Bean
//     // public Docket api() {
//     //     return new Docket(DocumentationType.SWAGGER_2)
//     //             .host(tryHost).apiInfo(buildApiInfo())
//     //             .select()
//     //             .apis(RequestHandlerSelectors.basePackage("com.example.itdd.controller"))
//     //             .paths(PathSelectors.any())
//     //             .build();
//     // }
//     @Bean
//     public GroupedOpenApi publicApi() {
//         return GroupedOpenApi.builder()
//                 .group("Public API")
//                 .packagesToScan("com.example.itdd.controller")
//                 .build();
//     }
//     // private ApiInfo buildApiInfo() {

// 	// 	return new ApiInfoBuilder().title("IT").description("").version("1.0").build();
// 	// }
// }