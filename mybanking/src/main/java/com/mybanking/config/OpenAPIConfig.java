package com.mybanking.config;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("dev")
public class OpenAPIConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Employee Management API")
                        .version("1.0.0")
                        .description("API for managing employees in the UPCI Family")
                        .contact(new Contact()
                                .name("Deepak Kashyap")
                                .email("drk40825@gmail.com")
                                .url("https://www.linkedin.com/in/deepak-kashyap-130688122?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app")));
    }
}
