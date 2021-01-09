package com.example.demo.service.Impl;

import com.example.demo.pojo.TbGoods;
import com.example.demo.service.TbGoodsService;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class TbGoodsServiceImpl implements TbGoodsService {
    @Override
    public List<TbGoods> goodsList() {
        TbGoods goods = new TbGoods();
        goods.setId(1L);
        goods.setName("mayun");
        List<TbGoods> tbGoods = Arrays.asList(goods);//封装到list集合中
        return tbGoods;
    }
}
