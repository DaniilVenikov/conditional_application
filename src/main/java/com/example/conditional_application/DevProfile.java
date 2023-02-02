package com.example.conditional_application;

public class DevProfile implements SystemProfile{
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
