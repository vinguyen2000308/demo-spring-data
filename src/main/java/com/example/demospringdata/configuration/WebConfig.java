package com.example.demospringdata.configuration;

import com.example.demospringdata.interceptor.LocalInterceptor;
import com.example.demospringdata.interceptor.TenantNameInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {


    @Autowired
    private TenantNameInterceptor tenantNameInterceptor;

    @Autowired
    private LocalInterceptor localInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tenantNameInterceptor);
        registry.addInterceptor(localInterceptor);
    }
}
