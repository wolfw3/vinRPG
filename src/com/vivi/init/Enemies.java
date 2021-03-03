package com.vivi.init;

import com.vivi.battle.Fighter;

public class Enemies {
    public Fighter GOBLIN = new Fighter("Goblin")
            .setMaxHP(0.5)
            .setDEF(0.75)
            .setMDEF(0.75)
            .setATK(0.5)
            .setGold(15)
            .setXP(25);
}
