package jp.reina.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jp.reina.blog.mapper.TagMapper;
import jp.reina.blog.entity.Tag;
import jp.reina.blog.service.ITagService;
import org.springframework.stereotype.Service;

/**
 * (TblTag)表服务实现类
 *
 * @author lixun
 * @since 2022-12-05 10:11:31
 */
@Service("tagService")
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}

