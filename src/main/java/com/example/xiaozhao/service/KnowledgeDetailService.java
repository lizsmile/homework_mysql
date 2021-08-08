package com.example.xiaozhao.service;

import com.example.xiaozhao.dao.KnowledgeDetail;
import com.example.xiaozhao.mapper.KnowledgeDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhili
 * @date: 2021/8/8 14:54
 * @description:
 * @modifiedby:
 * @modifiedtime:
 */
@Service
public class KnowledgeDetailService {
    @Autowired
    KnowledgeDetailMapper knowledgeDetailMapper;

    public KnowledgeDetail getDetailByKnowledgeStructureId(int id) {
        return knowledgeDetailMapper.getDetailByKnowledgeStructureId(id);
    }

    public List<KnowledgeDetail> getAllDetail() {
        return knowledgeDetailMapper.getAllDetail();
    }
    public KnowledgeDetail getDetailByDetailId(int id) {
        return knowledgeDetailMapper.getDetailByDetailId(id);
    }
    public int insertDetail(KnowledgeDetail entity) {
        return knowledgeDetailMapper.insertDetail(entity);
    }
    public int deleteDetailByKnowledgeId(int id) {
        return knowledgeDetailMapper.deleteDetailByKnowledgeId(id);
    }
    public int updateDetail(KnowledgeDetail entity) {
        return knowledgeDetailMapper.updateDetail(entity);
    }
}
