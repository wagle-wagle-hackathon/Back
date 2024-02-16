package umc.beanstalk.config;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);   // 내 서버가 응답을 할 때 JSON을 자바스크립트에서 처리할 수 있게 할지를 설정하는 것
        config.addAllowedOriginPattern("");   // 모든 IP 응답을 허용
        config.addAllowedHeader("");   // 모든 헤더의 응답을 허용
        config.addAllowedMethod("*");   // 모든 HTTP Method 요청을 허용
        source.registerCorsConfiguration("/api/v1/**", config);
        return new CorsFilter();
    }
}