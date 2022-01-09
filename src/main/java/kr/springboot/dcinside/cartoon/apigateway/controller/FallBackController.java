package kr.springboot.dcinside.cartoon.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/user-fallback")
    public String userFallback() {
        return "사용자 서비스를 사용할 수 없습니다.";
    }

    @GetMapping("/auth-fallback")
    public String authFallback() {
        return "인증 서비스를 사용할 수 없습니다.";
    }

}
