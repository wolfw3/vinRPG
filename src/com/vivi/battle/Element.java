package com.vivi.battle;


public class Element {
    public final String name;
    public Element[] strongAgainst, weakAgainst;
    public Element(String name) {
        this.name = name;
    }

    public Element setStrongAgainst(Element... elements) {
        strongAgainst = elements;
        return this;
    }

    public Element setWeakAgainst(Element... elements) {
        weakAgainst = elements;
        return this;
    }

    public boolean getStrongAgainst(Element element) {
        for (Element element1 : strongAgainst) {
            if (element == element1) return true;
        }
        return false;
    }

    public boolean getWeakAgainst(Element element) {
        for (Element element1 : weakAgainst) {
            if (element == element1) return true;
        }
        return false;
    }
}
