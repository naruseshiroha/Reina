package jp.reina.blog.entity;

import jp.reina.blog.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * (TblUser)表实体类
 *
 * @author lixun
 * @since 2022-12-02 15:31:24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class User extends BaseEntity {

	private static final long serialVersionUID = -96490286805480381L;

	/**
	 * 主键
	 */
	private String id;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 手机
	 */
	private String telephone;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 姓
	 */
	private String firstName;

	/**
	 * 名
	 */
	private String lastName;

	/**
	 * 头像
	 */
	private String avatar;

	/**
	 * 性别
	 */
	private String gender;

	/**
	 * 签名
	 */
	private String signature;

	/**
	 * 角色
	 */
	private String role;

	/**
	 * 1=删除，0=未删除
	 */
	private Integer delFlag;

	/**
	 * 冻结
	 */
	private Integer froze;

	/**
	 * 昵称
	 */
	private String nickName;

}

