package com.example.demo.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ConfigurationProperties(prefix = "ma1")

//使用参数类Properties批量读取默认配置文件中的参数
public class Parameter implements Serializable {
    int i ;
    String name ;
   /* int i = 0;
    String name = "ma";  类中赋值则优先显示类中的值，类中没有赋值则显示配置文件中参数的值
    ，配置文件中的参数名必须和类中的参数名一致*/
}
