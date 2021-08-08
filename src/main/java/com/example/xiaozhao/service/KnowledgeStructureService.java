package com.example.xiaozhao.service;

import com.example.xiaozhao.dao.KnowledgeStructure;
import com.example.xiaozhao.mapper.KnowledgeStructureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhili
 * @date: 2021/8/8 10:59
 * @description:
 * @modifiedby:
 * @modifiedtime:
 */

@Service
public class KnowledgeStructureService {

    @Autowired
    KnowledgeStructureMapper knowledgeStructureMapper;

    public List<KnowledgeStructure> getAllKnowledgeStructure() {
        return knowledgeStructureMapper.getAllKnowledgeStructure();
    }

    public KnowledgeStructure getKnowledgeStructureById(int id) {
        return knowledgeStructureMapper.getKnowledgeStructureById(id);
    }

    public void insertKnowledgeStructure(KnowledgeStructure entity) {
        knowledgeStructureMapper.insertKnowledgeStructure(entity);
    }

    public int deleteKnowledgeStructureById(int id) {
        return knowledgeStructureMapper.deleteKnowledgeStructureById(id);
    }

    public int updateKnowledgeStructure(KnowledgeStructure entity) {
        return knowledgeStructureMapper.updateKnowledgeStructure(entity);
    }
}
