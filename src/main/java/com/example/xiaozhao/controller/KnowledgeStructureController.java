package com.example.xiaozhao.controller;

import com.example.xiaozhao.dao.KnowledgeDetail;
import com.example.xiaozhao.dao.KnowledgeStructure;
import com.example.xiaozhao.service.KnowledgeDetailService;
import com.example.xiaozhao.service.KnowledgeStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("getKnowledgeStructure/{id}")
    public KnowledgeStructure getKnowledgeStructureById(@PathVariable int id) {
        return knowledgeStructureService.getKnowledgeStructureById(id);
    }

    @PostMapping("insert")
    public String insertKnowledgeStructure(@RequestBody KnowledgeStructure entity) {
        int result = knowledgeStructureService.insertKnowledgeStructure(entity);
        return result > 0 ? "insert succeed" : "insert failed";
    }

    @DeleteMapping("delete/{id}")
    public String deleteKnowledgeStructureById(@PathVariable int id) {
        int result = knowledgeStructureService.deleteKnowledgeStructureById(id);
        return result > 0 ? "delete succeed" : "delete failed";
    }

    @RequestMapping("update")
    public String updateKnowledgeStructure(@RequestBody KnowledgeStructure entity) {
        int result = knowledgeStructureService.updateKnowledgeStructure(entity);
        return result > 0 ? "update succeed" : "update failed";
    }

    // detail
    @RequestMapping("getDetailByStruct/{id}")
    public KnowledgeDetail getDetailByKnowledgeStructureId(@PathVariable int id) {
        return knowledgeDetailService.getDetailByKnowledgeStructureId(id);
    }

    @RequestMapping("getAllDetail")
    public List<KnowledgeDetail> getAllDetail() {
        return knowledgeDetailService.getAllDetail();
    }

    @RequestMapping("getDetail/{id}")
    public KnowledgeDetail getDetailByDetailId(@PathVariable int id) {
        return knowledgeDetailService.getDetailByDetailId(id);
    }
    @RequestMapping("detail/insert")
    public int insertDetail(@RequestBody KnowledgeDetail entity) {
        return knowledgeDetailService.insertDetail(entity);
    }
    @DeleteMapping("detail/delete/{id}")
    public int deleteDetailByKnowledgeId(@PathVariable int id) {
        return knowledgeDetailService.deleteDetailByKnowledgeId(id);
    }
    @RequestMapping("detail/update")
    public int updateDetail(@RequestBody KnowledgeDetail entity) {
        return knowledgeDetailService.updateDetail(entity);
    }
}