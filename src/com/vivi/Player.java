package com.vivi;

import com.vivi.battle.Fighter;
import com.vivi.battle.Skill;
import com.vivi.items.Accessory;
import com.vivi.items.Armor;
import com.vivi.items.Item;
import com.vivi.items.Weapon;

import java.util.ArrayList;

public class Player extends Fighter {
    public static Player INSTANCE;
    public Player(String name, String className, String perk) {
        super(name);
        this.className = className;
        this.perk = perk;
    }
    public final String className;
    public final String perk;
    public ArrayList<Weapon> weapons = new ArrayList<>();
    public ArrayList<Armor> armors = new ArrayList<>();
    public ArrayList<Accessory> accessories = new ArrayList<>();
    public ArrayList<Item> items = new ArrayList<>();

    public Player equipWeapon(int slot) {
        equippedWeapon = weapons.get(slot);
        return this;
    }

    public Player equipArmor(int slot) {
        equippedArmor = armors.get(slot);
        return this;
    }

    public Player equipAccessory(int slot) {
        equippedAccessory = accessories.get(slot);
        return this;
    }

    public Player addWeapon(Weapon weapon) {
        weapons.add(weapon);
        return this;
    }

    public Player addArmor(Armor armor) {
        armors.add(armor);
        return this;
    }

    public Player addAccessory(Accessory accessory) {
        accessories.add(accessory);
        return this;
    }

    public Player addSkill(Skill skill) {
        skills.add(skill);
        return this;
    }

    public Player addItem(Item item) {
        items.add(item);
        return this;
    }
}
