package com.vivi.battle;

import com.vivi.init.Elements;

public class Skill {
    public StatusEffect effect;
    public double statusChance;
    public final String name;
    public String description;
    public int costMP = 0, costHP = 0;
    public int heal = 0;
    public int turns = 0;
    public double damageMultiplier = 0, ATK = 0, DEF = 0, mATK = 0, mDEF = 0, AGI = 0;
    public Element element = Elements.PHYSICAL;
    public Skill(String name) {
        this.name = name;
    }

    public Skill setStatusEffect(StatusEffect effect, double chance) {
        this.effect = effect;
        statusChance = chance;
        return this;
    }

    public Skill setElement(Element element) {
        this.element = element;
        return this;
    }

    public Skill setHeal(int amount) {
        heal = amount;
        return this;
    }

    public Skill setATK(double multiplier) {
        ATK = multiplier;
        return this;
    }

    public Skill setDEF(double multiplier) {
        DEF = multiplier;
        return this;
    }

    public Skill setMATK(double multiplier) {
        mATK = multiplier;
        return this;
    }

    public Skill setMDEF(double multiplier) {
        mDEF = multiplier;
        return this;
    }

    public Skill setAGI(double multiplier) {
        AGI = multiplier;
        return this;
    }

    public Skill setDescription(String text) {
        description = text;
        return this;
    }

    public Skill setCostMP(int cost) {
        costMP = cost;
        return this;
    }

    public Skill setCostHP(int cost) {
        costHP = cost;
        return this;
    }

    public Skill setDamage(double multiplier) {
        damageMultiplier = multiplier;
        return this;
    }
}
