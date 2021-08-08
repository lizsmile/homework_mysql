package com.example.xiaozhao.mapper;

import com.example.xiaozhao.dao.KnowledgeStructure;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : zhili
 * @date: 2021/8/8 11:00
 * @description:
 * @modifiedby:
 * @modifiedtime:
 */
@Mapper
@Repository
public interface KnowledgeStructureMapper {
    // select
    List<KnowledgeStructure> getAllKnowledgeStructure();
    KnowledgeStructure getKnowledgeStructureById(int id);
    // insert
    void insertKnowledgeStructure(KnowledgeStructure entity);
    // delete
    int deleteKnowledgeStructureById(int id);
    // update
    int updateKnowledgeStructure(KnowledgeStructure entity);
}
