package jp.reina.blog.entity;

import java.util.Date;

import jp.reina.blog.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 发布表(TblRelease)��ʵ����
 *
 * @author 张智辉
 * @since 2022-12-02 17:56:36
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Release extends BaseEntity {

    private static final long serialVersionUID = -55394903620844564L;

    /**
     * id
     */
    private Integer id;

    /**
     * 标题名称
     */
    private String titleName;

    /**
     * 内容
     */
    private Integer contentData;

    /**
     * 1=删除，0=未删除
     */
    private Integer delFlag;

}

