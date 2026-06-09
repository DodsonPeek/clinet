package com.example.addon;

import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.MeteorClient;
import java.awt.Color;

public class Categories {
    public static final Category SL1WED_ADDON = new Category(
        "Sl1wed's addon",                    // This is the tab name!
        MeteorClient.INSTANCE,
        new Color(255, 100, 100)             // Red color for the tab
    );
}
