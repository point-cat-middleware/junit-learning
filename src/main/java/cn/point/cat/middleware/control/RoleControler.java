package cn.point.cat.middleware.control;

import cn.point.cat.middleware.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RoleControler {
    @Autowired
    private RolesService rolesService;

    @GetMapping("")
    public String index(){
        rolesService.getByIds(1);
        return  "junit-learning";
    }
}
