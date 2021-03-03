package com.vivi.battle;

import com.vivi.Player;
import com.vivi.items.Item;

public class Battle {
    public final Player player;
    public final Fighter enemy;
    public Battle(Player player, Fighter enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public int[] attack() {
        return new int[]{2, 1};
    }

    public int[] useSkill(Skill skill) {
        return new int[]{3, 2};
    }

    public int[] useItem(Item item) {
        return new int[]{1, 2};
    }
}
