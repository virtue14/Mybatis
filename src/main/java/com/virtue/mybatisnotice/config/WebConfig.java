package com.virtue.mybatisnotice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    private String resourcePath = "/upload/**"; // view에서 사용할 경로
    // Mac 경로
    private String savePath = "file:///Users/duck/Desktop/프로젝트/Youtube/MyBatisNotice/upload_files/";
    // Windows 경로
//    String savePath = "file:///C:/duck/Desktop/프로젝트/Youtube/MyBatisNotice/upload_files/";


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(resourcePath)
                .addResourceLocations(savePath);
    }
}
