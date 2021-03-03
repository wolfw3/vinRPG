package com.vivi;

import com.vivi.gui.MainMenu;
import com.vivi.init.Elements;

public class Main {
    public static void main(String[] args) {
        Elements.init();
        MainMenu mainMenu = new MainMenu();
        mainMenu.init();
    }
}
