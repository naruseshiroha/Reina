package jp.reina.blog.entity;

import java.util.Date;

import jp.reina.blog.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * (TblCategory)表实体类
 *
 * @author lixun
 * @since 2022-12-05 10:22:38
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Category extends BaseEntity {

	private static final long serialVersionUID = -71913429427718216L;

	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 类别名称
	 */
	private String categoryName;

	/**
	 * 类别描述
	 */
	private String categoryDesc;

	/**
	 * 启用
	 */
	private Integer status;

	/**
	 * 1=删除，0=未删除
	 */
	private Integer delFlag;

}

