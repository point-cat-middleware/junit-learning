package cn.point.cat.middleware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.point.cat.middleware.dao")
public class AppLaunch {

    public static void main(String[] args) {

        SpringApplication.run(AppLaunch.class,args);
    }

}
