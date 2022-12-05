package jp.reina.blog.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jp.reina.blog.common.BaseController;
import jp.reina.blog.common.R;
import jp.reina.blog.entity.Tag;
import jp.reina.blog.service.ITagService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * (TblTag)表控制层
 *
 * @author lixun
 * @since 2022-12-05 10:11:31
 */
@RestController
@RequestMapping("tag")
@RequiredArgsConstructor
public class TagController extends BaseController {
	/**
	 * 服务对象
	 */
	private final ITagService tagService;

	/**
	 * 分页查询所有数据
	 *
	 * @param page 分页对象
	 * @param tag  查询实体
	 * @return 所有数据
	 */
	@GetMapping
	public R selectAll(Page<Tag> page, Tag tag) {
		return R.ok(this.tagService.page(page, new QueryWrapper<>(tag)));
	}

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("{id}")
	public R selectOne(@PathVariable Serializable id) {
		return R.ok(this.tagService.getById(id));
	}

	/**
	 * 新增数据
	 *
	 * @param tag 实体对象
	 * @return 新增结果
	 */
	@PostMapping
	public R insert(@RequestBody Tag tag) {
		return toAjax(this.tagService.save(tag));
	}

	/**
	 * 修改数据
	 *
	 * @param tag 实体对象
	 * @return 修改结果
	 */
	@PutMapping
	public R update(@RequestBody Tag tag) {
		return toAjax(this.tagService.updateById(tag));
	}

	/**
	 * 删除数据
	 *
	 * @param idList 主键结合
	 * @return 删除结果
	 */
	@DeleteMapping
	public R delete(@RequestParam("idList") List<Long> idList) {
		return toAjax(this.tagService.removeByIds(idList));
	}
}

