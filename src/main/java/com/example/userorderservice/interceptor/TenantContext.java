package com.example.userorderservice.interceptor;

import org.springframework.stereotype.Component;

@Component
public class TenantContext {
    private static final ThreadLocal<String> currentTenant = new InheritableThreadLocal<>();

    private TenantContext() {
    }

    public static String getCurrentTenant() {
        return currentTenant.get();
    }

    public static void setCurrentTenant(String tenant) {
        currentTenant.set(tenant);
    }

    public static void clearCurrentTenant() {
        currentTenant.remove();
    }
}
