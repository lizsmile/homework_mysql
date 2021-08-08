package com.example.xiaozhao.mapper;

import com.example.xiaozhao.dao.KnowledgeDetail;

import java.util.List;

/**
 * @author : zhili
 * @date: 2021/8/8 14:51
 * @description:
 * @modifiedby:
 * @modifiedtime:
 */
public interface KnowledgeDetailMapper {
    KnowledgeDetail getDetailByKnowledgeStructureId(int id);

    List<KnowledgeDetail> getAllDetail();
    KnowledgeDetail getDetailByDetailId(int id);
    int insertDetail(KnowledgeDetail entity);
    int deleteDetailByKnowledgeId(int id);
    int updateDetail(KnowledgeDetail entity);
}
