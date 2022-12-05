package jp.reina.blog.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jp.reina.blog.common.BaseController;
import jp.reina.blog.common.R;
import jp.reina.blog.entity.Category;
import jp.reina.blog.service.ICategoryService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * (TblCategory)表控制层
 *
 * @author lixun
 * @since 2022-12-05 10:22:39
 */
@RestController
@RequestMapping("category")
@RequiredArgsConstructor
public class CategoryController extends BaseController {
	/**
	 * 服务对象
	 */
	private final ICategoryService categoryService;

	/**
	 * 分页查询所有数据
	 *
	 * @param page     分页对象
	 * @param category 查询实体
	 * @return 所有数据
	 */
	@GetMapping
	public R selectAll(Page<Category> page, Category category) {
		return R.ok(this.categoryService.page(page, new QueryWrapper<>(category)));
	}

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("{id}")
	public R selectOne(@PathVariable Serializable id) {
		return R.ok(this.categoryService.getById(id));
	}

	/**
	 * 新增数据
	 *
	 * @param category 实体对象
	 * @return 新增结果
	 */
	@PostMapping
	public R insert(@RequestBody Category category) {
		return toAjax(this.categoryService.save(category));
	}

	/**
	 * 修改数据
	 *
	 * @param category 实体对象
	 * @return 修改结果
	 */
	@PutMapping
	public R update(@RequestBody Category category) {
		return toAjax(this.categoryService.updateById(category));
	}

	/**
	 * 删除数据
	 *
	 * @param idList 主键结合
	 * @return 删除结果
	 */
	@DeleteMapping
	public R delete(@RequestParam("idList") List<Long> idList) {
		return toAjax(this.categoryService.removeByIds(idList));
	}
}

