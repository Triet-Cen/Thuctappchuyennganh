package com.example.doan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Serve static assets located under templates/ so index.html can load them
        registry.addResourceHandler("/css/**")
                .addResourceLocations("classpath:/templates/css/");
        registry.addResourceHandler("/js/**")
                .addResourceLocations("classpath:/templates/js/");
        registry.addResourceHandler("/img/**")
                .addResourceLocations("classpath:/templates/img/");
        registry.addResourceHandler("/fonts/**")
                .addResourceLocations("classpath:/templates/fonts/");
        registry.addResourceHandler("/electro-master/**")
                .addResourceLocations("classpath:/templates/electro-master/");
        // Also expose anything under /static/ (default) just in case
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }
}
