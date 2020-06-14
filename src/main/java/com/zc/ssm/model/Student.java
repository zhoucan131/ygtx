package com.zc.ssm.model;

import lombok.Data;

@Data
public class Student {
    private Integer sid;

    private String sname;

    private String snamePinyin;

    private Integer age;

    private String remark;

    private Long fileId;

    private String filePath;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSnamePinyin() {
        return snamePinyin;
    }

    public void setSnamePinyin(String snamePinyin) {
        this.snamePinyin = snamePinyin == null ? null : snamePinyin.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }
}