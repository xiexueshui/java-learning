package mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;

/**
 * @auther xxs
 * @date 2021-07-09
 */
@Configuration
@ComponentScan({"mybatis.*"})
public class springConfig {
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory getSqlSessionFactory() throws IOException {
         InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        return new SqlSessionFactoryBuilder().build(inputStream);
    }
}
