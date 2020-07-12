package cn.point.cat.middleware.service.impl;

import cn.point.cat.middleware.entity.Roles;
import cn.point.cat.middleware.dao.RolesMapper;
import cn.point.cat.middleware.service.RolesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fireflyhoo
 * @since 2020-07-10
 */
@Service
public class RolesServiceImp  implements RolesService {

    @Autowired
    protected RolesMapper baseMapper;

    @Override
    public Roles getByIds(Integer id) {
        return baseMapper.selectById(id);
    }
}
