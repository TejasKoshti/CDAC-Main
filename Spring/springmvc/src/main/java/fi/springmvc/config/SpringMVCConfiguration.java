package fi.springmvc.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.ViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "fi.springmvc.controller", "fi.springmvc.beans" })
@PropertySource("classpath:application.properties")
public class SpringMVCConfiguration implements WebMvcConfigurer {

    @Autowired
    Environment env;

    // DataSource Bean
    @Bean
    public DataSource dataSource() {
        String driver = env.getProperty("db.connection.driverclass");
        String url = env.getProperty("db.connection.url");
        String user = env.getProperty("db.connection.username");
        String pwd = env.getProperty("db.connection.password");

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url); // Fixed method name
        ds.setUsername(user);
        ds.setPassword(pwd);
        return ds;
    }

    // JdbcTemplate Bean
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    // ViewResolver Bean
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
