package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 帮扶对象
 *
 * @author 
 * @email
 */
@TableName("bangfuduixiang")
public class BangfuduixiangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BangfuduixiangEntity() {

	}

	public BangfuduixiangEntity(T t) {
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
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 帮扶类型
     */
    @ColumnInfo(comment="帮扶类型",type="int(11)")
    @TableField(value = "bangfuduixiang_types")

    private Integer bangfuduixiangTypes;


    /**
     * 帮扶详情
     */
    @ColumnInfo(comment="帮扶详情",type="longtext")
    @TableField(value = "bangfuduixiang_content")

    private String bangfuduixiangContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "bangfuduixiang_delete")

    private Integer bangfuduixiangDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间  listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：帮扶类型
	 */
    public Integer getBangfuduixiangTypes() {
        return bangfuduixiangTypes;
    }
    /**
	 * 设置：帮扶类型
	 */

    public void setBangfuduixiangTypes(Integer bangfuduixiangTypes) {
        this.bangfuduixiangTypes = bangfuduixiangTypes;
    }
    /**
	 * 获取：帮扶详情
	 */
    public String getBangfuduixiangContent() {
        return bangfuduixiangContent;
    }
    /**
	 * 设置：帮扶详情
	 */

    public void setBangfuduixiangContent(String bangfuduixiangContent) {
        this.bangfuduixiangContent = bangfuduixiangContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getBangfuduixiangDelete() {
        return bangfuduixiangDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setBangfuduixiangDelete(Integer bangfuduixiangDelete) {
        this.bangfuduixiangDelete = bangfuduixiangDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Bangfuduixiang{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", bangfuduixiangTypes=" + bangfuduixiangTypes +
            ", bangfuduixiangContent=" + bangfuduixiangContent +
            ", bangfuduixiangDelete=" + bangfuduixiangDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
