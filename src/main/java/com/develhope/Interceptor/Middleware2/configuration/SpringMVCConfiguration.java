package com.develhope.Interceptor.Middleware2.configuration;

import com.develhope.Interceptor.Middleware2.interceptor.BasicInterceptor;
import com.develhope.Interceptor.Middleware2.interceptor.MonthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {
    @Autowired
    private MonthInterceptor monthInterceptor;
    @Autowired
    private BasicInterceptor basicInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(monthInterceptor);
        registry.addInterceptor(basicInterceptor);
    }
}
