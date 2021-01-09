package com.example.demo.controller;

import com.example.demo.pojo.TbGoods;
import com.example.demo.properties.CustomProfile;
import com.example.demo.properties.Parameter;
import com.example.demo.service.TbGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TbGoodsController {

    @Autowired
    TbGoodsService goodsService;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    Parameter parameter;

    @Autowired
    CustomProfile customProfile;

    @GetMapping("/goods")
    public List<TbGoods> goodsList(){

        redisTemplate.boundHashOps("count1").put("ma",123);



        stringRedisTemplate.boundListOps("count2").leftPushAll("123","asd");
       return goodsService.goodsList();

    }
    //读取默认配置文件中的某个参数
    @Value("${spring.redis.port}")
    String redisPort;//自定义变量名接收

    //读取自定义参数
    @Value("${java0824.ma2}")
    String m;

    @RequestMapping("/demo1")
    public String demo1(){
      // return redisPort; //读取默认配置文件中的某个参数
      // return m ;//读取自定义参数
      //  return parameter+"";//使用参数类Properties批量读取默认配置文件中的参数
      return customProfile+"";
    }
}
