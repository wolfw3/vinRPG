package com.vivi.battle;

import com.vivi.init.Accessories;
import com.vivi.init.Armors;
import com.vivi.init.Weapons;
import com.vivi.items.Accessory;
import com.vivi.items.Armor;
import com.vivi.items.Weapon;

import java.util.ArrayList;

public class Fighter {

    public Fighter(String name) {
        this.name = name;
    }

    public int maxHP = 100, HP = 100, maxMP = 20, MP = 20, ATK = 10, DEF = 10, mATK = 10, mDEF = 10, AGI = 5, gold = 0, XP = 0;
    public Weapon equippedWeapon = Weapons.EMPTY;
    public Armor equippedArmor = Armors.EMPTY;
    public Accessory equippedAccessory = Accessories.EMPTY;
    public ArrayList<Skill> skills = new ArrayList<>();

    public Fighter setGold(int amount) {
        this.gold = amount;
        return this;
    }

    public Fighter setXP(int amount) {
        this.XP = amount;
        return this;
    }

    public Fighter setMaxHP(double multiplier) {
        maxHP *= multiplier;
        HP = maxHP;
        return this;
    }

    public Fighter setMaxMP(double multiplier) {
        maxMP *= multiplier;
        MP = maxMP;
        return this;
    }

    public Fighter setATK(double multiplier) {
        ATK *= multiplier;
        return this;
    }

    public Fighter setDEF(double multiplier) {
        DEF *= multiplier;
        return this;
    }

    public Fighter setMATK(double multiplier) {
        mATK *= multiplier;
        return this;
    }

    public Fighter setMDEF(double multiplier) {
        mDEF *= multiplier;
        return this;
    }

    public Fighter setAGI(double multiplier) {
        AGI *= multiplier;
        return this;
    }

    public final String name;
}
