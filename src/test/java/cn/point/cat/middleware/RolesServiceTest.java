package cn.point.cat.middleware;

import cn.point.cat.middleware.dao.RolesMapper;
import cn.point.cat.middleware.entity.Roles;
import cn.point.cat.middleware.service.RolesService;
import cn.point.cat.middleware.service.impl.RolesServiceImp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Mockito.when;

public class RolesServiceTest extends  MockitoBaseTest{


    @InjectMocks
    private RolesServiceImp rolesService;

    @Mock
    private RolesMapper rolesMapper;



    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetById(){
        Roles roles = new Roles();
        roles.setId(1);
        roles.setRole("Mock_test_role");
        roles.setUsername("");
        when(rolesMapper.selectById(1)).thenReturn(roles);

        Roles rl = rolesService.getByIds(1);
        Assert.assertEquals(rl.getRole(),"Mock_test_role");
    }

}
