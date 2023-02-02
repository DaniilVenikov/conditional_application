package com.example.conditional_application.service;

import com.example.conditional_application.service.SystemProfile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
