package com.vivi.battle;

public class StatusEffect {
    public String name;
    public double damage = 0;
    public double ATK = 0, DEF = 0, mATK = 0, mDEF = 0, AGI = 0, disableChance = 0;
    public int turns = 0;
    public boolean disables = false;
    public StatusEffect(String name) {
        this.name = name;
    }

    public StatusEffect setDisables(boolean b, double probability) {
        disableChance = probability;
        disables = b;
        return this;
    }

    public StatusEffect setDamage(double percent) {
        damage = percent;
        return this;
    }

    public StatusEffect setATK(double multiplier) {
        ATK = multiplier;
        return this;
    }

    public StatusEffect setDEF(double multiplier) {
        DEF = multiplier;
        return this;
    }

    public StatusEffect setMATK(double multiplier) {
        mATK = multiplier;
        return this;
    }

    public StatusEffect setMDEF(double multiplier) {
        mDEF = multiplier;
        return this;
    }

    public StatusEffect setAGI(double multiplier) {
        AGI = multiplier;
        return this;
    }

    public StatusEffect setTurns(int number) {
        turns = number;
        return this;
    }
}
