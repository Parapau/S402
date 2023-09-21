package cat.tiacademy.barcelonactiva.FrancoToda.Toda.s04.t02.n01.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public DataSource getDataSource() {
        return DataSourceBuilder.create()
          .driverClassName("com.mysql.cj.jdbc.Driver")
          .url("jdbc:mysql://127.0.0.1:3307/elMeuDb")
          .username("user1")
          .password("pass")
          .build();	
    }
}
