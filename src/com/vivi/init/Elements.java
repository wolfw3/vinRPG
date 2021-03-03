package com.vivi.init;

import com.vivi.battle.Element;

public class Elements {
    public static Element PYRO = new Element("Pyro");
    public static Element HYDRO = new Element("Hydro");
    public static Element NATURA = new Element("Natura");
    public static Element ELECTRO = new Element("Electro");
    public static Element GEO = new Element("Geo");
    public static Element AERO = new Element("Aero");
    public static Element CRYO = new Element("Cryo");
    public static Element PHYSICAL = new Element("Physical");
    public static Element MAGIC = new Element("Magic");


    public static void init() {
        PHYSICAL.setStrongAgainst()
                .setWeakAgainst();

        MAGIC.setStrongAgainst()
                .setWeakAgainst();

        PYRO.setStrongAgainst(NATURA, CRYO)
                .setWeakAgainst(HYDRO, GEO);

        HYDRO.setStrongAgainst(PYRO, GEO)
                .setWeakAgainst(NATURA, ELECTRO);

        NATURA.setStrongAgainst(HYDRO, GEO)
                .setWeakAgainst(PYRO, CRYO, AERO);

        ELECTRO.setStrongAgainst(HYDRO, AERO)
                .setWeakAgainst(NATURA, GEO);

        GEO.setStrongAgainst(PYRO, CRYO, ELECTRO)
                .setWeakAgainst(AERO, HYDRO);

        AERO.setStrongAgainst(GEO, NATURA)
                .setWeakAgainst(ELECTRO, CRYO);

        CRYO.setStrongAgainst(HYDRO, NATURA, AERO)
                .setWeakAgainst(PYRO, GEO);
    }
}
