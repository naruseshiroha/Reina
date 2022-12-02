package jp.reina.blog.controller;


import jp.reina.blog.entity.Release;
import jp.reina.blog.service.IReleaseService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 发布表(TblRelease)����Ʋ�
 *
 * @author 张智辉
 * @since 2022-12-02 17:56:37
 */
@RestController
@RequestMapping("release")
@RequiredArgsConstructor
public class ReleaseController extends BaseController {
    /**
     * �������
     */
    private final IReleaseService releaseService;

    /**
     * ��ҳ��ѯ��������
     *
     * @param page    ��ҳ����
     * @param release ��ѯʵ��
     * @return ��������
     */
    @GetMapping
    public R selectAll(Page<Release> page, Release release) {
        return R.ok(this.releaseService.page(page, new QueryWrapper<>(release)));
    }

    /**
     * ͨ��������ѯ��������
     *
     * @param id ����
     * @return ��������
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return R.ok(this.releaseService.getById(id));
    }

    /**
     * ��������
     *
     * @param release ʵ�����
     * @return �������
     */
    @PostMapping
    public R insert(@RequestBody Release release) {
        return toAjax(this.releaseService.save(release));
    }

    /**
     * �޸�����
     *
     * @param release ʵ�����
     * @return �޸Ľ��
     */
    @PutMapping
    public R update(@RequestBody Release release) {
        return toAjax(this.releaseService.updateById(release));
    }

    /**
     * ɾ������
     *
     * @param idList �������
     * @return ɾ�����
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return toAjax(this.releaseService.removeByIds(idList));
    }
}

