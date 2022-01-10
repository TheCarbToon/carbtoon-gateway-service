package kr.springboot.dcinside.cartoon.apigateway.service;

import io.jsonwebtoken.Claims;

public interface JwtTokenProvider {

    Claims getClaimsFromJWT(String token);

    boolean validateToken(String authToken);

}
