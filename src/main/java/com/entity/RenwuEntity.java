package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 任务
 *
 * @author 
 * @email
 */
@TableName("renwu")
public class RenwuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public RenwuEntity() {

	}

	public RenwuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 发布人
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 任务名称
     */
    @TableField(value = "renwu_name")

    private String renwuName;


    /**
     * 任务类型
     */
    @TableField(value = "renwu_types")

    private Integer renwuTypes;


    /**
     * 附件
     */
    @TableField(value = "renwu_file")

    private String renwuFile;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 任务详情
     */
    @TableField(value = "news_content")

    private String newsContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：发布人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：发布人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：任务名称
	 */
    public String getRenwuName() {
        return renwuName;
    }


    /**
	 * 获取：任务名称
	 */

    public void setRenwuName(String renwuName) {
        this.renwuName = renwuName;
    }
    /**
	 * 设置：任务类型
	 */
    public Integer getRenwuTypes() {
        return renwuTypes;
    }


    /**
	 * 获取：任务类型
	 */

    public void setRenwuTypes(Integer renwuTypes) {
        this.renwuTypes = renwuTypes;
    }
    /**
	 * 设置：附件
	 */
    public String getRenwuFile() {
        return renwuFile;
    }


    /**
	 * 获取：附件
	 */

    public void setRenwuFile(String renwuFile) {
        this.renwuFile = renwuFile;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：任务详情
	 */
    public String getNewsContent() {
        return newsContent;
    }


    /**
	 * 获取：任务详情
	 */

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Renwu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", renwuName=" + renwuName +
            ", renwuTypes=" + renwuTypes +
            ", renwuFile=" + renwuFile +
            ", insertTime=" + insertTime +
            ", newsContent=" + newsContent +
            ", createTime=" + createTime +
        "}";
    }
}
