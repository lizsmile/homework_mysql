package com.example.xiaozhao.dao;

import lombok.Data;

/**
 * @author : zhili
 * @date: 2021/8/8 10:36
 * @description:
 * @modifiedby:
 * @modifiedtime:
 */
@Data
public class KnowledgeStructure {
    private Integer id;
    private Integer parentId;
    private boolean levelIsTop;
    private boolean levelIsLeaf;
    private Integer level;
    private String levelName;
    private String knowledgePath;

    @Override
    public String toString() {
        return "KnowledgeStructure{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", levelIsStop=" + levelIsTop +
                ", levelIsLeaf=" + levelIsLeaf +
                ", level=" + level +
                ", levelName='" + levelName + '\'' +
                ", knowledgePath='" + knowledgePath + '\'' +
                '}';
    }

}
