//package com.example.visual.config;
//
//import com.example.visual.LoginHandlerInterceptor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class LoginConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        System.out.println("注册拦截器");
//        LoginHandlerInterceptor interceptor = new LoginHandlerInterceptor();
//        // 添加拦截的请求，并排除几个不拦截的请求
//        registry.addInterceptor(interceptor)
//                .addPathPatterns("/rabies/**"/*, "/rabies/index.html", "/rabies/crowdHR.html", "/rabies/spatialHR.html",
//                        "/rabies/spatialPV.html", "/rabies/temporalHR.html", "/rabies/temporalPV.html",
//                        "/rabies/timeSeries.html"*/)
//                .excludePathPatterns("/rabies/login.html", "/rabies/login",
//                        "/rabies/css/**", "/rabies/images/**",
//                        "/rabies/js/**");
//
//    }
//}
//
