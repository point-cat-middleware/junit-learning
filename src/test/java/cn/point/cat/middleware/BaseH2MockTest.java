package cn.point.cat.middleware;

import org.flywaydb.core.Flyway;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = AppLaunch.class)
public class BaseH2MockTest {
    private static Flyway flyway;
    @Autowired
    private DataSource dataSource;

    @Before
    public void initMigration() throws SQLException {
        //初始化表结构
        flyway = Flyway.configure().dataSource(dataSource)
                .locations("filesystem:src/main/resources/db/migration/mysql").load();
        flyway.migrate();
    }

    @After
    public void cleanMigration() throws SQLException {
        flyway.clean();
    }
}