package com.yuan.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class PmsProductSaleAttrValue implements Serializable {
    private Integer id;

    private Integer productId;

    private Integer saleAttrId;

    private String saleAttrValueName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(Integer saleAttrId) {
        this.saleAttrId = saleAttrId;
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
        sb.append(", productId=").append(productId);
        sb.append(", saleAttrId=").append(saleAttrId);
        sb.append(", saleAttrValueName=").append(saleAttrValueName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}