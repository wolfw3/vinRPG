package com.vivi.items;

import com.vivi.battle.Element;
import com.vivi.init.Elements;

public class Equipment {
    public Equipment(String name) {
        this.name = name;

    }

    public Equipment(Equipment settings) {
        this.name = settings.name;
        this.description = settings.description;
        this.HP = settings.HP;
        this.MP = settings.MP;
        this.ATK = settings.ATK;
        this.DEF = settings.DEF;
        this.mATK = settings.mATK;
        this.mDEF = settings.mDEF;
        this.AGI = settings.AGI;
    }
    public String description;
    public final String name;
    public int HP = 0, MP = 0, ATK = 0, DEF = 0, mATK = 0, mDEF = 0, AGI = 0;

    public boolean isEmpty() {
        return name.isEmpty();
    }

    public Element element = Elements.PHYSICAL;

    public Equipment setElement(Element element) {
        this.element = element;
        return this;
    }

    public Equipment setDescription(String description) {
        this.description = description;
        return this;
    }

    public Equipment setHP(int amount) {
        HP = amount;
        return this;
    }

    public Equipment setMP(int amount) {
        MP = amount;
        return this;
    }

    public Equipment setATK(int amount) {
        ATK = amount;
        return this;
    }

    public Equipment setDEF(int amount) {
        DEF = amount;
        return this;
    }

    public Equipment setMATK(int amount) {
        mATK = amount;
        return this;
    }

    public Equipment setMDEF(int amount) {
        mDEF = amount;
        return this;
    }

    public Equipment setAGI(int amount) {
        AGI = amount;
        return this;
    }
}
