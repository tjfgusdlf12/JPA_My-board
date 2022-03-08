package com.board.My.board.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    private ApiInfo swaggerInfo(){
        return new ApiInfoBuilder().title("Spring Api Documentaion")
                .description("웹 개발시 사용되는 서버 API에 대한 연동 문서임").license("").licenseUrl("").version("1").build();
    }
    @Bean
    public Docket swaggerApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(swaggerInfo()).select().apis(RequestHandlerSelectors.basePackage("com.board.My.Board.controller"))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }

    /**여기까지 했음 Application을 실행해  https://locahost:8080/swagger-ui.html에 접속해보자.
     * 그러면 로그인 창이 뜨고 Spring Security의 기본설정이 되어있을거임
     * porn.xml에 springSecurity 부분을 주석 처리하고 실행해보자*/
}
