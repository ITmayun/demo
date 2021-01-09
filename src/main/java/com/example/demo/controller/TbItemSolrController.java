package com.example.demo.controller;

import com.example.demo.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.result.ScoredPage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TbItemSolrController {

    @Autowired
    SolrTemplate solrTemplate;

    @RequestMapping("/itemList")
    public List<TbItem> itemList(){
      Query query = new SimpleQuery("*:*");
        ScoredPage<TbItem> page = solrTemplate.queryForPage("collection1", query, TbItem.class);
        List<TbItem> content = page.getContent();
        return content;

    }

}
