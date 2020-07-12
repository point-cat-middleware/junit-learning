package cn.point.cat.middleware;

import cn.point.cat.middleware.dao.RolesMapper;
import cn.point.cat.middleware.entity.Roles;
import com.github.database.rider.core.api.dataset.DataSet;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;

public class RolesMapperTest extends  BaseH2MockTest {


    @Autowired
    private RolesMapper rolesMapper;

    @Test
    @DataSet(value="roles_names.yaml")
    public void testGetById(){
        Roles roles = rolesMapper.selectById(1);
        System.out.println(roles);
    }
}
