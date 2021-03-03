package com.vivi.gui;

import com.vivi.Player;
import com.vivi.init.Armors;
import com.vivi.init.Skills;
import com.vivi.init.Weapons;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static com.vivi.init.Armors.*;
import static com.vivi.init.Skills.*;
import static com.vivi.init.Weapons.*;

public class CharacterCreator {
    private JPanel panel;
    private JTextField txtName;
    private JLabel lblName;
    private JLabel lblClass;
    private JRadioButton rdoKnight;
    private JRadioButton rdoMage;
    private JRadioButton rdoRogue;
    private JRadioButton rdoWarlock;
    private JLabel lblPerk;
    private JComboBox cboPerk;
    private JButton btnFinish;
    JFrame frame = new JFrame("Character Creation");

    private String perk = "";
    private String className = "";
    private String name = "";

    public CharacterCreator() {
        cboPerk.addActionListener(actionEvent -> {
            switch(cboPerk.getSelectedIndex()) {
                case 0:
                    perk = "HP";
                    break;
                case 1:
                    perk = "AGI";
                    break;
                case 2:
                    perk = "Gold";
                    break;
                case 3:
                    perk = "XP";
                    break;
                default:
            }
            update();
        });
        btnFinish.addActionListener(actionEvent -> {
            if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to start with these options?") == JOptionPane.OK_OPTION)
                Player.INSTANCE = new Player(name, className, perk);
                switch(className) {
                    case "Knight":
                        Player.INSTANCE.addWeapon(SHORTSWORD);
                        Player.INSTANCE.addArmor(CHAINMAIL);
                        Player.INSTANCE.addSkill(WAR_CRY);
                        break;
                    case "Mage":
                        Player.INSTANCE.addWeapon(BEGINNERS_SPELLBOOK);
                        Player.INSTANCE.addArmor(LEATHER_TUNIC);
                        Player.INSTANCE.addSkill(LIGHT_HEAL);
                        break;
                    case "Warlock":
                        Player.INSTANCE.addWeapon(BIRCH_STAFF);
                        Player.INSTANCE.addArmor(CHAINMAIL);
                        Player.INSTANCE.addSkill(FIREBALL);
                        break;
                    case "Rogue":
                        Player.INSTANCE.addWeapon(IRON_DAGGER).equipWeapon(0);
                        Player.INSTANCE.addArmor(LEATHER_TUNIC);
                        Player.INSTANCE.addSkill(DOUBLE_CUT);
                        break;
                }

        });
        txtName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                name = txtName.getText();
                update();
            }
        });
        rdoKnight.addActionListener(actionEvent -> {
            className = "Knight";
            update();
        });
        rdoMage.addActionListener(actionEvent -> {
            className = "Mage";
            update();
        });
        rdoWarlock.addActionListener(actionEvent -> {
            className = "Warlock";
            update();
        });
        rdoRogue.addActionListener(actionEvent -> {
            className = "Rogue";
            update();
        });
    }

    public void update() {
        if(perk.isEmpty()) btnFinish.setEnabled(false);
        else if(className.isEmpty()) btnFinish.setEnabled(false);
        else if(name.isEmpty()) btnFinish.setEnabled(false);
        else btnFinish.setEnabled(true);

    }

    public void init() {
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
