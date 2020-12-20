package com.solppi.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// 테스트를 진행할 때 JUnit에 내장된 실행자 외에 다른 실행자를 실행
// SpringRunner라는 스프링 실행자를 사용
// 스프링 부트 테스트와 JUnit 사이에 연결자 역할
@RunWith(SpringRunner.class)
// 여러 스프링 테스트 어노테이션 중, Web(Spring MVC)에 집중할 수 있는 어노테이션
// 선언할 경우 @Controller, @ControllerAdvice 등을 사용할 수 있음
// 단, @Service, @Component, @Repository 등은 사용할 수 없음
// 여기서는 컨트롤러만 사용하기에 선언함
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    // 스프링이 관리하는 빈(Bean)을 주입받음
    @Autowired
    // 웹 API를 테스트할 때 사용
    // 스프링 MVC 테스트의 시작점
    // 이 클래스를 통해 HTTP GET,POST 등에 대한 API 테스트가 가능
    private MockMvc mvc;

    @Test
    public void hello_retruned() throws Exception {
        String hello = "hello";

        // MockMvc를 통해 /hello 주소로 HTTP GET 요청을 함
        // 체이닝이 지원되어 여러 검증 기능을 이어서 선언 가능
        mvc.perform(get("/hello"))
                .andExpect(status().isOk())     // mvc.perform의 결과가 OK(200)인지 아닌지 검증
                .andExpect(content().string(hello));    // Controller에서 리턴하는 값이 "hello"인지 아닌지 검증
    }
}
