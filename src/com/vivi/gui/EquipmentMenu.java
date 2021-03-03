package com.vivi.gui;

import com.vivi.Player;
import com.vivi.items.Weapon;

import javax.swing.*;

public class EquipmentMenu {
    private JList<String> lstWeapons;
    private JPanel panel;
    private JScrollPane scpWeapons;
    private JButton btnEquipWeapon;
    private JButton btnInfoWeapon;
    private JButton btnDiscard;
    private JButton btnClose;
    private JList<String> lstArmor;
    private JList<String> lstAccessories;
    private JButton btnEquipArmor;
    private JButton btnEquipAccessory;
    private JButton btnInfoAccessory;
    private JButton btnInfoArmor;
    private JButton btnDiscardArmor;
    private JButton btnDiscardAccessory;
    private JLabel lblWeapons;
    private JLabel lblAccessories;
    private JLabel lblArmor;
    private JScrollPane scpArmor;
    private JScrollPane scpAccessories;
    private JFrame frame;

    public EquipmentMenu() {
        btnEquipWeapon.addActionListener(actionEvent -> {
            Player.INSTANCE.equipWeapon(lstWeapons.getSelectedIndex());
            update();
        });
        btnEquipArmor.addActionListener(actionEvent -> {
            Player.INSTANCE.equipArmor(lstArmor.getSelectedIndex());
            update();
        });
        btnEquipAccessory.addActionListener(actionEvent -> {
            Player.INSTANCE.equipAccessory(lstAccessories.getSelectedIndex());
            update();
        });
        btnInfoWeapon.addActionListener(actionEvent -> {
            Weapon weapon = Player.INSTANCE.weapons.get(lstWeapons.getSelectedIndex());
            StringBuilder info = new StringBuilder("Name: " + weapon.name +
                    "\nType: " + Weapon.typeToString(weapon.type) +
                    "\nDescription: " + weapon.description +
                    "\n\nElement: " + weapon.element +
                    "\n\nStats:");
            if(weapon.ATK != 0) info.append("\nATK: ").append(weapon.ATK);
            if(weapon.mATK != 0) info.append("\nmATK: ").append(weapon.mATK);
            if(weapon.DEF != 0) info.append("\nDEF: ").append(weapon.DEF);
            if(weapon.mDEF != 0) info.append("\nmDEF: ").append(weapon.mDEF);
            if(weapon.AGI != 0) info.append("\nAGI: ").append(weapon.AGI);
            if(weapon.HP != 0) info.append("\nHP: ").append(weapon.HP);
            JOptionPane.showMessageDialog(frame, info.toString());
        });
    }

    public void init() {
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
        update();
    }

    public void update() {
        DefaultListModel<String> weaponsModel = new DefaultListModel<>();
        Player.INSTANCE.weapons.stream().map(weapon -> weapon.name).forEach(weaponsModel::addElement);
        lstWeapons.setModel(weaponsModel);

        DefaultListModel<String> armorModel = new DefaultListModel<>();
        Player.INSTANCE.armors.stream().map(armor -> armor.name).forEach(armorModel::addElement);
        lstArmor.setModel(armorModel);

        DefaultListModel<String> accessoriesModel = new DefaultListModel<>();
        Player.INSTANCE.accessories.stream().map(accessory -> accessory.name).forEach(accessoriesModel::addElement);
        lstAccessories.setModel(accessoriesModel);
    }
}
