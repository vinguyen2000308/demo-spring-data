package com.example.demospringdata.core;

import org.springframework.beans.factory.annotation.Value;

import java.util.Objects;

public class ThreadLocalStorage {

    @Value("${spring.datasource.default}")
    private static  String defaultDatasource;

    private static final ThreadLocal<String> tenant = new ThreadLocal<>();

    public static void setTenant(String tenantName) {
        tenant.set(tenantName);
    }

    public static String getTenantName() {
        String s = tenant.get();
        if (Objects.isNull(s))
            return "la";
        else
            return s;
    }

}
