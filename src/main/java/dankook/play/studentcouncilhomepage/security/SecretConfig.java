package dankook.play.studentcouncilhomepage.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecretConfig {

    @Value("${security.jwt.token.secret-key}")
    private String jwtSecretKey;

    @Value("${security.jwt.token.expire-length}")
    private Long jwtValidityTime;

    @Value("${security.jwt.token.expire-length-refresh}")
    private Long refreshValidityTime;

    @Bean
    public SecretKey newSecretKey() {
        return new SecretKey(jwtSecretKey, jwtValidityTime, refreshValidityTime);
    }
}
