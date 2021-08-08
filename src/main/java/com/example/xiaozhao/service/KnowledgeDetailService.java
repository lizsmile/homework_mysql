package com.example.xiaozhao.service;

import com.example.xiaozhao.dao.KnowledgeDetail;
import com.example.xiaozhao.mapper.KnowledgeDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public KnowledgeDetail getDetailByKnowledgeId(int id) {
        return knowledgeDetailMapper.getDetailByKnowledgeId(id);
    }
}
