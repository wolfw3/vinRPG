package com.vivi.init;

import com.vivi.items.Armor;
import com.vivi.items.Equipment;

import static com.vivi.init.Elements.*;

public class Armors {
    public static Armor EMPTY = new Armor(new Equipment(""));
    public static Armor CHAINMAIL = new Armor(new Equipment("Chainmail")
            .setDescription("Armor made from iron chains.")
            .setDEF(4)
            .setMDEF(1));

    public static Armor LEATHER_TUNIC = new Armor(new Equipment("Leather Tunic")
            .setDescription("Tunic made to defend from light attacks.")
            .setDEF(2)
            .setMDEF(3));

    public static Armor CHARRED_CHESTPLATE = new Armor(new Equipment("Charred Chestplate")
            .setDescription("A chestplate charred black from the Eaven Fire.")
            .setDEF(8)
            .setMDEF(5)
            .setElement(PYRO));

    public static Armor CLOUDS_STRIFE = new Armor(new Equipment("Cloud's Strife")
            .setDescription("A set of armor as light as clouds.")
            .setDEF(30)
            .setMDEF(30)
            .setElement(AERO));

    public static Armor WINTERS_LIGHT = new Armor(new Equipment("Winter's Light")
            .setDescription("Armor as white as snow.")
            .setDEF(50)
            .setMDEF(50)
            .setElement(CRYO));
}
