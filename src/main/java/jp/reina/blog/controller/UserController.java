package jp.reina.blog.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jp.reina.blog.common.BaseController;
import jp.reina.blog.common.R;
import jp.reina.blog.entity.User;
import jp.reina.blog.service.IUserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * (TblUser)表控制层
 *
 * @author lixun
 * @since 2022-12-02 15:31:25
 */
@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController extends BaseController {
	/**
	 * 服务对象
	 */
	private final IUserService userService;

	/**
	 * 分页查询所有数据
	 *
	 * @param page 分页对象
	 * @param user 查询实体
	 * @return 所有数据
	 */
	@GetMapping
	public R selectAll(Page<User> page, User user) {
		return R.ok(this.userService.page(page, new QueryWrapper<>(user)));
	}

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("{id}")
	public R selectOne(@PathVariable Serializable id) {
		return R.ok(this.userService.getById(id));
	}

	/**
	 * 新增数据
	 *
	 * @param user 实体对象
	 * @return 新增结果
	 */
	@PostMapping
	public R insert(@RequestBody User user) {
		return toAjax(this.userService.save(user));
	}

	/**
	 * 修改数据
	 *
	 * @param user 实体对象
	 * @return 修改结果
	 */
	@PutMapping
	public R update(@RequestBody User user) {
		return toAjax(this.userService.updateById(user));
	}

	/**
	 * 删除数据
	 *
	 * @param idList 主键结合
	 * @return 删除结果
	 */
	@DeleteMapping
	public R delete(@RequestParam("idList") List<Long> idList) {
		return toAjax(this.userService.removeByIds(idList));
	}
}

