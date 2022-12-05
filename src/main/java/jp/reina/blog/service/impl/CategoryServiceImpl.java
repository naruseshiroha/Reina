package jp.reina.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jp.reina.blog.mapper.CategoryMapper;
import jp.reina.blog.entity.Category;
import jp.reina.blog.service.ICategoryService;
import org.springframework.stereotype.Service;

/**
 * (TblCategory)表服务实现类
 *
 * @author lixun
 * @since 2022-12-05 10:22:39
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}

