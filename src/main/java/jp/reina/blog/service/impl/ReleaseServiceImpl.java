package jp.reina.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jp.reina.blog.mapper.ReleaseMapper;
import jp.reina.blog.entity.Release;
import jp.reina.blog.service.IReleaseService;
import org.springframework.stereotype.Service;

/**
 * 发布表(TblRelease)�����ʵ����
 *
 * @author 张智辉
 * @since 2022-12-02 17:56:37
 */
@Service("releaseService")
public class ReleaseServiceImpl extends ServiceImpl<ReleaseMapper, Release> implements IReleaseService {

}

