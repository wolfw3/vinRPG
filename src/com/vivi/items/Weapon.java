package com.vivi.items;

import com.vivi.battle.Element;
import com.vivi.init.Elements;

public class Weapon extends Equipment {

    public static String typeToString(int type) {
        switch(type) {
            case 0: return "None";
            case 1: return "Sword";
            case 2: return "Staff";
            case 3: return "Spellbook";
            case 4: return "Dagger";
            default:
                return "Typeless";
        }
    }

    public static int NONE = 0;
    public static int SWORD = 1;
    public static int STAFF = 2;
    public static int SPELLBOOK = 3;
    public static int DAGGER = 4;
    public Weapon(int type, Equipment settings) {
        super(settings);
        this.type = type;
    }

    public int type;
}
