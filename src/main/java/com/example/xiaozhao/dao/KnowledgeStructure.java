package com.example.xiaozhao.dao;

/**
 * @author : zhili
 * @date: 2021/8/8 10:36
 * @description:
 * @modifiedby:
 * @modifiedtime:
 */
public class KnowledgeStructure {
    private Integer id;
    private Integer parentId;
    private boolean levelIsStop;
    private boolean levelIsLeaf;
    private Integer level;
    private String levelName;
    private String knowledgePath;

    @Override
    public String toString() {
        return "KnowledgeStructure{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", levelIsStop=" + levelIsStop +
                ", levelIsLeaf=" + levelIsLeaf +
                ", level=" + level +
                ", levelName='" + levelName + '\'' +
                ", knowledgePath='" + knowledgePath + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public boolean isLevelIsStop() {
        return levelIsStop;
    }

    public void setLevelIsStop(boolean levelIsStop) {
        this.levelIsStop = levelIsStop;
    }

    public boolean isLevelIsLeaf() {
        return levelIsLeaf;
    }

    public void setLevelIsLeaf(boolean levelIsLeaf) {
        this.levelIsLeaf = levelIsLeaf;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getKnowledgePath() {
        return knowledgePath;
    }

    public void setKnowledgePath(String knowledgePath) {
        this.knowledgePath = knowledgePath;
    }
}
