package com.vivi.init;

import com.vivi.battle.StatusEffect;

public class StatusEffects {
    public static StatusEffect POISON = new StatusEffect("Poison").setDamage(0.1).setMDEF(0.75);
    public static StatusEffect BURN = new StatusEffect("Burn").setDamage(0.05).setATK(0.75);
    public static StatusEffect PARALYZED = new StatusEffect("Paralyzed").setDisables(true, 0.5).setAGI(0.5);
    public static StatusEffect TERRIFIED = new StatusEffect("Terrified").setATK(0.67).setDEF(0.67);
    public static StatusEffect FROZEN = new StatusEffect("Frozen").setDisables(true, 1);
}
