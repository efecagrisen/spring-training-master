package com.cydeo.config;

import lombok.Data;
import lombok.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@Data
@Component
public class AppConfigData {

    @org.springframework.beans.factory.annotation.Value("${username}")
    private String userName;

    @org.springframework.beans.factory.annotation.Value("${password}")
    private String password;

    @org.springframework.beans.factory.annotation.Value("${url}")
    private String url;

}
