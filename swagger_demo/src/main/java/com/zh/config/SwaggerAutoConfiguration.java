package com.zh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerAutoConfiguration {

    @Bean
    public Docket createRestApi1() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).groupName("用户接口组")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zh.controller"))
                .build();
        return docket;
    }

    @Bean
    public Docket createRestApi2() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).groupName("菜单接口组")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zh.controller"))
                .build();

        return docket;
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API接口文档")
                .contact(new Contact("周晖","http://","1741484908@qq.com"))
                .version("1.0")
                .description("API 描述")
                .build();
    }
}
