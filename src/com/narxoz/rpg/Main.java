package com.narxoz.rpg;

import com.narxoz.rpg.artifact.*;
import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.vault.ChronomancerEngine;
import com.narxoz.rpg.vault.VaultRunResult;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Homework 9 Demo: Visitor + Memento ===");

        Inventory inv1 = new Inventory();
        inv1.addArtifact(new Weapon("ดาบ (Sword)", 100, 5, 10));
        inv1.addArtifact(new Potion("Health", 50, 1, 20));

        Inventory inv2 = new Inventory();
        inv2.addArtifact(new Armor("Plate", 200, 15, 30));
        inv2.addArtifact(new Ring("Magic", 150, 1, 5));
        inv2.addArtifact(new Scroll("Fire", 80, 1, "Fireball"));

        Hero h1 = new Hero("Alpamys", 100, 50, 10, 5, 200, inv1);
        Hero h2 = new Hero("Batyr", 120, 30, 15, 8, 300, inv2);

        ChronomancerEngine engine = new ChronomancerEngine();
        VaultRunResult result = engine.runVault(List.of(h1, h2));

        System.out.println(result);
    }
}