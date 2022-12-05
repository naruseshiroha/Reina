package jp.reina.blog.entity;

import java.util.Date;

import jp.reina.blog.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * (TblTag)表实体类
 *
 * @author lixun
 * @since 2022-12-05 10:11:31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Tag extends BaseEntity {

	private static final long serialVersionUID = 776804414693263544L;

	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 名称
	 */
	private String tagName;

	/**
	 * 描述
	 */
	private String tagDesc;

	/**
	 * 1=删除，0=未删除
	 */
	private Integer delFlag;

	/**
	 * 启用
	 */
	private Integer status;

}

