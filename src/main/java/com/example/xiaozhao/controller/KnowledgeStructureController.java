package com.example.xiaozhao.controller;

import com.example.xiaozhao.dao.KnowledgeDetail;
import com.example.xiaozhao.dao.KnowledgeStructure;
import com.example.xiaozhao.service.KnowledgeDetailService;
import com.example.xiaozhao.service.KnowledgeStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : zhili
 * @date: 2021/8/8 10:41
 * @description:
 * @modifiedby:
 * @modifiedtime:
 */
@RestController
@RequestMapping("/knowledgeStructure")
public class KnowledgeStructureController {

    @Autowired
    private KnowledgeStructureService knowledgeStructureService;

    @Autowired
    private KnowledgeDetailService knowledgeDetailService;

    @RequestMapping("getAllKnowledgeStructure")
    public List<KnowledgeStructure> getAllKnowledgeStructure() {
        return knowledgeStructureService.getAllKnowledgeStructure();
    }

    @RequestMapping("getDetail/{id}")
    public KnowledgeDetail getDetailByKnowledgeId(@PathVariable int id) {
        return knowledgeDetailService.getDetailByKnowledgeId(id);
    }



}