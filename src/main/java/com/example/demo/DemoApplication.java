package com.example.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.example.demo.properties.CustomProfile;
import com.example.demo.properties.Parameter;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.jms.annotation.EnableJms;

@EnableDubbo
@EnableJms
@SpringBootApplication
@MapperScan("com.example.demo.dao")
//开启配置参数类，让 Spring Boot 根据应用所声明的依赖来对 Spring 框架进行自动配置，一般加在主类上。
@EnableConfigurationProperties(
        {Parameter.class, CustomProfile.class}//放在启动类上，所有的controller，service。。都可以使用
)
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
