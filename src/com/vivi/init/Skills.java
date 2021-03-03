package com.vivi.init;

import com.vivi.battle.Skill;

import static com.vivi.init.Elements.*;
import static com.vivi.init.StatusEffects.*;

public class Skills {
    public static Skill DOUBLE_CUT = new Skill("Double Cut")
            .setDescription("Attacks twice for extra damage.")
            .setCostMP(5)
            .setDamage(1.5)
            .setElement(PHYSICAL);

    public static Skill LIGHT_HEAL = new Skill("Light Heal")
            .setDescription("Heals the user a small amount.")
            .setCostMP(10)
            .setHeal(90)
            .setElement(MAGIC);

    public static Skill FIREBALL = new Skill("Fireball")
            .setDescription("Launches a fireball at the enemy, dealing extra damage with a chance to burn.")
            .setStatusEffect(BURN, 0.2)
            .setDamage(1.1)
            .setCostMP(7)
            .setElement(PYRO);

    public static Skill ELECTROSHOCK = new Skill("Electroshock")
            .setDescription("Shocks the enemy with pure electricity to stun them.")
            .setDamage(0.5)
            .setStatusEffect(PARALYZED, 0.75)
            .setCostMP(10)
            .setElement(ELECTRO);

    public static Skill WAR_CRY = new Skill("War Cry")
            .setDescription("A loud battle cry scares your enemies and reduces their ATK/DEF")
            .setStatusEffect(TERRIFIED, 1)
            .setCostMP(10)
            .setElement(PHYSICAL);

    public static Skill POISONED_TIP = new Skill("Poisoned Tip")
            .setDescription("Stabs an enemy with a poisoned weapon, dealing light damage with a chance to poison.")
            .setDamage(0.5)
            .setStatusEffect(POISON, 0.5)
            .setCostMP(10)
            .setElement(NATURA);

    public static Skill ICICLE_SPEAR = new Skill("Icicle Spear")
            .setDescription("Hits an enemy multiple times with a spear made of ice.")
            .setDamage(0.5)
            .setStatusEffect(FROZEN, 0.1)
            .setCostMP(15)
            .setElement(CRYO);

    public static Skill ROCK_SMASH = new Skill("Rock Smash")
            .setDescription("")
            .setDamage(1.25)
            .setStatusEffect(PARALYZED, 0.15)
            .setCostHP(15)
            .setElement(GEO);
}
