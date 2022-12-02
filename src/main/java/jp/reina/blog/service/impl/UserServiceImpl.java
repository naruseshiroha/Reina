package jp.reina.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jp.reina.blog.mapper.UserMapper;
import jp.reina.blog.entity.User;
import jp.reina.blog.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * (TblUser)表服务实现类
 *
 * @author lixun
 * @since 2022-12-02 15:31:24
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

