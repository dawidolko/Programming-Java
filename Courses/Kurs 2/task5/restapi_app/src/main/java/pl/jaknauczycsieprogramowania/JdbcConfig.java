package pl.jaknauczycsieprogramowania;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


public class JdbcConfig {

    public static DataSource getMysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test_schema");
        dataSource.setUsername("kamil");
        dataSource.setPassword("kamil");

        return dataSource;
    }
}
