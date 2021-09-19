package com.example.demospringdata.configuration;

import com.example.demospringdata.routing.TenantAwareRoutingSource;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.*;

@Configuration
public class DataSourceConfiguration {

    List<String> market = Arrays.asList("mz", "la", "pe");

    @Bean
    public DataSource dataSource() {
        AbstractRoutingDataSource dataSource = new TenantAwareRoutingSource();
        Map<Object, Object> targetDataSources = new HashMap<>();
        market.forEach(item -> targetDataSources.put(item, getDatasourceByTenant(item)));
        dataSource.setTargetDataSources(targetDataSources);
        dataSource.afterPropertiesSet();

        return dataSource;
    }


    public DataSource getDatasourceByTenant(String tenant) {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3307/bccs3_order_" + tenant);
        config.setUsername("root");
        config.setPassword("Abcds007");
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.addDataSourceProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        HikariDataSource dataSource = new HikariDataSource(config);
        return dataSource;
    }


}
