package com.solppi;

// 앞으로 만들 프로젝트의 메인 클래스
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication 로 인해 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성으로 모두 자동으로 설정
 * @SpringBootApplication 이 있는 위치부터 설정을 읽어가기 때문에 이 클래스는 항상 프로젝트의 최상단에 위치해야 함
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // SpringApplication.run 으로 인해 내장 WAS(Web Application Server, 웹 애플리케이션 서버)를 실행
        // 내장 WAS란 별도로 외부에 WAS를 두지 않고 애플리케이션을 실행할 때 내부에서 WAS를 실행하는 것
        // 항상 서버에 톰캣을 설치할 필요가 없게 되고 스프링 부트로 만들어진 Jar 파일로 실행하면 됨
        // 스프링 부트에서는 내장 WAS를 사용하는 것을 권장, 언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있기 때문
        SpringApplication.run(Application.class, args);
    }
}