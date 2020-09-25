package com.cent.mpdemo.config;

import io.swagger.models.Model;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.AlternateTypeRules;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cent.mpdemo"))
                .paths(PathSelectors.any())
                .build();
        docket.alternateTypeRules(AlternateTypeRules.newMapRule(String.class, List.class));
        docket.alternateTypeRules(AlternateTypeRules.newMapRule(List.class, Model.class));
        return docket;
//.enable(false) 项目上线时可以关掉swagger 文档
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("office在线文档")
                .description("create by  cui")
                .termsOfServiceUrl("http://www.baidu.com")
                .version("1.0")
                .build();
    }


}
