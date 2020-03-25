package com.yuan.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UmsMemberLevel implements Serializable {
    private Integer id;

    private String name;

    private String growthPoint;

    private Integer defaultStatus;

    private String freeFreightPoint;

    private String commentGrowthPoint;

    private Integer priviledgeFreeFreight;

    private String priviledgeSignIn;

    private String priviledgeComment;

    private String priviledgePromotion;

    private BigDecimal priviledgeMemberPrice;

    private Date priviledgeBirthday;

    private String note;

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

    public String getGrowthPoint() {
        return growthPoint;
    }

    public void setGrowthPoint(String growthPoint) {
        this.growthPoint = growthPoint;
    }

    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public String getFreeFreightPoint() {
        return freeFreightPoint;
    }

    public void setFreeFreightPoint(String freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    public String getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public void setCommentGrowthPoint(String commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    public Integer getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    public String getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    public void setPriviledgeSignIn(String priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    public String getPriviledgeComment() {
        return priviledgeComment;
    }

    public void setPriviledgeComment(String priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    public String getPriviledgePromotion() {
        return priviledgePromotion;
    }

    public void setPriviledgePromotion(String priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    public BigDecimal getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    public void setPriviledgeMemberPrice(BigDecimal priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    public Date getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    public void setPriviledgeBirthday(Date priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", growthPoint=").append(growthPoint);
        sb.append(", defaultStatus=").append(defaultStatus);
        sb.append(", freeFreightPoint=").append(freeFreightPoint);
        sb.append(", commentGrowthPoint=").append(commentGrowthPoint);
        sb.append(", priviledgeFreeFreight=").append(priviledgeFreeFreight);
        sb.append(", priviledgeSignIn=").append(priviledgeSignIn);
        sb.append(", priviledgeComment=").append(priviledgeComment);
        sb.append(", priviledgePromotion=").append(priviledgePromotion);
        sb.append(", priviledgeMemberPrice=").append(priviledgeMemberPrice);
        sb.append(", priviledgeBirthday=").append(priviledgeBirthday);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}