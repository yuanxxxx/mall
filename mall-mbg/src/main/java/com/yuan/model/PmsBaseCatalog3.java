package com.yuan.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class PmsBaseCatalog3 implements Serializable {
    private Integer id;

    private String name;

    private Integer catalog2Id;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(Integer catalog2Id) {
        this.catalog2Id = catalog2Id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", catalog2Id=").append(catalog2Id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}