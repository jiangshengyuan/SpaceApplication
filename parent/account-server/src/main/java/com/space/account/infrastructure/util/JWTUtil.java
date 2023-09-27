package com.space.account.infrastructure.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

public class JWTUtil {
    public static final String TOKEN_SALT = "";
    public static final String ISSUER = "";
    private static Algorithm algorithm = null;
    private static JWTVerifier verifier = null;

    public String generateToken() {
        Date expiresAt = new Date(System.currentTimeMillis() + 10L * 60L * 1000L);
        Date issueAt = new Date(System.currentTimeMillis());
        return JWT.create()
                .withIssuer(ISSUER)
                .withExpiresAt(expiresAt)
                .withNotBefore(issueAt)
                .withIssuedAt(issueAt)
                .sign(getAlgorithm());
    }
    public static DecodedJWT deToken(String token){
        return getVerifier().verify(token);
    }
    public String generateNewToken(String oldToken) {
        DecodedJWT decodedJWT = deToken(oldToken);
        if(decodedJWT == null){
            return null;
        }
        if(decodedJWT.getExpiresAt().getTime()-System.currentTimeMillis() <10L*60L*1000L){
            return generateToken();
        }
        return oldToken;
    }

    public static Algorithm getAlgorithm() {
        if (algorithm == null) {
            algorithm = Algorithm.HMAC256(TOKEN_SALT);
        }
        return algorithm;
    }

    public static JWTVerifier getVerifier(){
        if(verifier == null){
            verifier = JWT.require(getAlgorithm()).withIssuer().build();
        }
        return verifier;
    }
}
