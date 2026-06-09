package com.example.addon.modules;

import meteordevelopment.meteorclient.systems.modules.Module;
import com.example.addon.Categories;

public class AutoResell extends Module {
    public AutoResell() {
        super(Categories.SL1WED_ADDON, "auto-resell", "Automatically buys and sells pearls");
    }
    
    @Override
    public void onActivate() {
        info("AutoResell activated!");  // This will show in chat when you toggle it
    }
    
    @Override
    public void onDeactivate() {
        info("AutoResell deactivated!");
    }
}
