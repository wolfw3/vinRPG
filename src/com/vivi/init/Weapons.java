package com.vivi.init;

import com.vivi.items.Equipment;
import com.vivi.items.Weapon;

import static com.vivi.init.Elements.*;
import static com.vivi.items.Weapon.*;

public class Weapons {
    public static Weapon EMPTY = new Weapon(NONE, new Equipment(""));

    public static Weapon SHORTSWORD = new Weapon(SWORD, new Equipment("Shortsword")
            .setDescription("A standard-issue sword.")
            .setATK(4));

    public static Weapon BIRCH_STAFF = new Weapon(STAFF, new Equipment("Birch Staff")
            .setDescription("A staff carved from wood.")
            .setMATK(3)
            .setATK(2));

    public static Weapon IRON_DAGGER = new Weapon(DAGGER, new Equipment("Iron Dagger")
            .setDescription("A dagger that may as well be in a kitchen.")
            .setATK(3)
            .setAGI(2));

    public static Weapon BEGINNERS_SPELLBOOK = new Weapon(SPELLBOOK, new Equipment("Beginner's Spellbook")
            .setDescription("A spellbook for novice casters.")
            .setMATK(4)
            .setElement(MAGIC));

    public static Weapon GWYNS_DAWN = new Weapon(SWORD, new Equipment("Gwyn's Dawn")
            .setDescription("A sword passed down from Gwynevere the holy knight. The blade is a flawless sheen of crimson.")
            .setATK(100)
            .setElement(AERO));

    public static Weapon OCEANIC_ATLAS = new Weapon(SPELLBOOK, new Equipment("Oceanic Atlas")
            .setDescription("An atlas of the world's oceans")
            .setMATK(10)
            .setElement(HYDRO));


}
