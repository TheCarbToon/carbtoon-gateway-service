package kr.springboot.dcinside.cartoon.apigateway;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.crypto.SecretKey;

@SpringBootTest
class ApiGatewayApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void getKeys() {
        SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS512);
        System.out.println(secretKey.getAlgorithm());
        System.out.println(secretKey.getEncoded());
        System.out.println(secretKey.getFormat());
    }

}
