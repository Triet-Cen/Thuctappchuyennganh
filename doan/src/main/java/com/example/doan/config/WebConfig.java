package com.example.doan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Serve assets from BOTH templates/ and static/ so existing paths keep working
        registry.addResourceHandler("/css/**")
                .addResourceLocations(
                        "classpath:/templates/css/",
                        "classpath:/static/css/");
        registry.addResourceHandler("/js/**")
                .addResourceLocations(
                        "classpath:/templates/js/",
                        "classpath:/static/js/");
        registry.addResourceHandler("/img/**")
                .addResourceLocations(
                        "classpath:/templates/img/",
                        "classpath:/static/img/");
        registry.addResourceHandler("/fonts/**")
                .addResourceLocations(
                        "classpath:/templates/fonts/",
                        "classpath:/static/fonts/");
        registry.addResourceHandler("/electro-master/**")
                .addResourceLocations("classpath:/templates/electro-master/");
        // Map vendor assets used by login page
        registry.addResourceHandler("/vendor/**")
                .addResourceLocations("classpath:/static/css/vendor/");
        // Also expose anything under /static/
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }
}
