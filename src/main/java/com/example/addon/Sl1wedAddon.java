package com.example.addon;  // Or com.sl1wed.addon if you renamed it

import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sl1wedAddon extends MeteorAddon {
    public static final Logger LOG = LoggerFactory.getLogger("sl1wed-addon");
    
    @Override
    public void onInitialize() {
        LOG.info("Initializing Sl1wed's Addon");
        // You'll register your modules here later
    }
    
    @Override
    public void onRegisterCategories() {
        // You'll register your custom tab here later
    }
    
    @Override
    public String getPackage() {
        return "com.example.addon";  // Must match your actual package path
    }
}
