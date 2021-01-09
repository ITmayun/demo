package com.example.demo.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ConfigurationProperties(prefix = "ma")
@Configuration//声明这是个配置类，指出该类是 Bean 配置的信息源，相当于XML中的，一般加在主类上。
@PropertySource(value = "test.properties",encoding = "utf-8")
public class CustomProfile implements Serializable {
    String value1 = "m1";
    String value2 = "m2";
    String value3 = "m3";
}
