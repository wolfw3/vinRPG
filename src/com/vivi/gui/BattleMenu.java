package com.vivi.gui;

import com.vivi.Player;
import com.vivi.battle.Battle;
import com.vivi.battle.Fighter;
import com.vivi.init.Enemies;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattleMenu {
    private JButton btnAttack;
    private JPanel panel;
    private JButton btnSkills;
    private JButton btnItems;
    private JButton btnRun;
    private JLabel lblPlayerName;
    private JLabel lblPlayerHP;
    private JLabel lblPlayerMP;
    private JLabel lblPlayerLog;
    private JLabel lblEnemyLog;
    private JLabel lblEnemyHP;
    private JLabel lblEnemyName;
    private JFrame frame;
    public Battle battle;

    public BattleMenu() {
        btnAttack.addActionListener(actionEvent -> {
            int[] damage = battle.attack();
            lblPlayerLog.setText(battle.player.name + " attacks, dealing " + damage[0] + " damage!");
            lblEnemyLog.setText(battle.enemy.name + " attacks, dealing " + damage[1] + " damage!");
            update();
        });
    }

    public void start(Fighter enemy) {
        battle = new Battle(Player.INSTANCE, enemy);
        frame = new JFrame("Battle: " + enemy.name);
        frame.pack();
        frame.setVisible(true);
    }

    public void update() {
        lblPlayerName.setText(battle.player.name);
        lblPlayerHP.setText("HP: " + battle.player.HP + "/" + battle.player.maxHP);
        lblPlayerMP.setText("MP: " + battle.player.MP + "/" + battle.player.maxMP);
        lblEnemyName.setText(battle.enemy.name);
        lblEnemyHP.setText("HP: " + battle.enemy.HP + "/" + battle.player.maxHP);
    }
}
