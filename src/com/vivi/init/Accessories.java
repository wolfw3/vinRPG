package com.vivi.init;

import com.vivi.items.Accessory;
import com.vivi.items.Equipment;

public class Accessories {
    public static Accessory EMPTY = new Accessory(new Equipment(""));

    public static Accessory LIFE_BAND = new Accessory(new Equipment("Life Band")
            .setDescription("Slightly increases HP.")
            .setHP(35));
}
