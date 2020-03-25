package com.yuan.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class PmsSkuSaleAttrValue implements Serializable {
    private Integer id;

    private Integer skuId;

    private Integer saleAttrId;

    private Integer saleAttrValueId;

    private String saleAttrName;

    private String saleAttrValueName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(Integer saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public Integer getSaleAttrValueId() {
        return saleAttrValueId;
    }

    public void setSaleAttrValueId(Integer saleAttrValueId) {
        this.saleAttrValueId = saleAttrValueId;
    }

    public String getSaleAttrName() {
        return saleAttrName;
    }

    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", skuId=").append(skuId);
        sb.append(", saleAttrId=").append(saleAttrId);
        sb.append(", saleAttrValueId=").append(saleAttrValueId);
        sb.append(", saleAttrName=").append(saleAttrName);
        sb.append(", saleAttrValueName=").append(saleAttrValueName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}