package jp.reina.blog.common;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lixun
 * @date 2022/12/2 十二月 周五 15:22
 */
@Data
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 搜索值
	 */
	@JsonIgnore
	@TableField(exist = false)
	private String searchValue;

	/**
	 * 创建者
	 */
	@TableField(fill = FieldFill.INSERT)
	private String createdBy;

	/**
	 * 创建时间
	 */
	@TableField(fill = FieldFill.INSERT)
	private Date createdAt;

	/**
	 * 更新者
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private String updatedBy;

	/**
	 * 更新时间
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updatedAt;

	/**
	 * 请求参数
	 */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@TableField(exist = false)
	private Map<String, Object> params = new HashMap<>();
}
