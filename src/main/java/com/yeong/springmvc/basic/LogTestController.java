package com.yeong.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());
//    private final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";
        System.out.println("name = " + name);

        log.trace("trace log={}", name); // 로그 레벨 순서대로 출력
        log.debug("debug log={}", name); // 디버깅 정보, 개발 시 디버깅 용도
        log.info("info log={}", name); // 시스템 운영 시 필요한 정보, 중요한 비지니스 정보, 운영 시스템에서 보는 정보
        log.warn("warn log={}", name); // 경고, 문제가 발생했을 때 로그
        log.error("error log={}", name); // 에러, 심각한 문제가 발생했을 때 로그

        // 로그를 사용하지 않아도 a+b 계산 로직이 먼저 실행 됨, 이런 방식으로 사용하면 X
        log.debug("String concat log" + name);

        return "ok";
    }

}
