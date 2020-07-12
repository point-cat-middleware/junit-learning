package cn.point.cat.middleware;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MockitoBaseTest.MockitoBaseConfig.class)
public class MockitoBaseTest {

    @Configuration
    @ComponentScan({ "cn.point.cat.middleware" })
    public static class MockitoBaseConfig{

    }
}