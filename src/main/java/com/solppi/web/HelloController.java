package com.solppi.web;

// 컨트롤러와 관련된 클래스들은 모두 web 패키지에 저장

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// JSON을 반환하는 컨트롤러를 만들어 줌
// ResponseBody를 각 메소드마다 선언했던 것을 한번에 사용할 수 있게 해
@RestController
public class HelloController {
    // HTTP Method인 Get 요청을 받을 수 있는 API를 만들어 줌
    // /hello로 요청이 오면 문자열 hello를 반환하는 기능
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
