package com.example.conditional_application;

public class ProductionProfile implements SystemProfile{
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
