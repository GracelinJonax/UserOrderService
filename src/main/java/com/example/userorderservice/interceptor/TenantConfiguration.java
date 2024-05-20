package com.example.userorderservice.interceptor;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@Getter
@ConfigurationProperties(prefix = "tenants")
public class TenantConfiguration {
    @Value("${defaultTenant}")
    private String defaultTenant;

    Map<Object, Object> datasource = new HashMap<>();

    public void setDatasource(Map<String, Map<String, String>> datasource) {
        datasource.forEach((key, value) ->
                this.datasource.put(key, DataSourceBuilder.create()
                        .url(value.get("url"))
                        .username(value.get("username"))
                        .password(value.get("password"))
                        .driverClassName(value.get("driverClassName"))
                        .build()));
    }

    @Bean
    public DataSource dataSource() {
        AbstractRoutingDataSource routingDataSource = new TenantDataSource();
        routingDataSource.setDefaultTargetDataSource(datasource.get(defaultTenant));
        routingDataSource.setTargetDataSources(datasource);
        routingDataSource.afterPropertiesSet();
        return routingDataSource;
    }
}
