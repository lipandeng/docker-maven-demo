package icu.climber.demo.fabricdockermaven.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class CmsOssResource implements Serializable {
    private Long id;

    @ApiModelProperty(value = "路径")
    private String path;

    @ApiModelProperty(value = "资源名称")
    private String name;

    @ApiModelProperty(value = "大小")
    private Double size;

    @ApiModelProperty(value = "宽度")
    private Integer width;

    @ApiModelProperty(value = "高度")
    private Integer height;

    @ApiModelProperty(value = "类型1图片，2视频")
    private Short type;

    @ApiModelProperty(value = "排序")
    private Integer sortNum;

    @ApiModelProperty(value = "父id")
    private Long parentId;

    @ApiModelProperty(value = "父表类型")
    private Short parentType;

    @ApiModelProperty(value = "状态1，启用 -1删除, 0 停用")
    private Short status;

    @ApiModelProperty(value = "添加时间")
    private Date createdAt;

    @ApiModelProperty(value = "修改时间")
    private Date updatedAt;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Short getParentType() {
        return parentType;
    }

    public void setParentType(Short parentType) {
        this.parentType = parentType;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", path=").append(path);
        sb.append(", name=").append(name);
        sb.append(", size=").append(size);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", type=").append(type);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", parentId=").append(parentId);
        sb.append(", parentType=").append(parentType);
        sb.append(", status=").append(status);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}