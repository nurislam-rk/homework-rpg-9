package com.narxoz.rpg.combatant;
import com.narxoz.rpg.artifact.Artifact;
import java.util.List;

public final class HeroMemento {
    private final String name;
    private final int hp, mana, gold, maxHp, attackPower, defense;
    private final List<Artifact> inventorySnapshot;

    HeroMemento(String name, int hp, int mana, int gold, int maxHp, int attackPower, int defense, List<Artifact> inv) {
        this.name = name; this.hp = hp; this.mana = mana; this.gold = gold;
        this.maxHp = maxHp; this.attackPower = attackPower; this.defense = defense;
        this.inventorySnapshot = List.copyOf(inv);
    }

    int getHp() { return hp; }
    int getMana() { return mana; }
    int getGold() { return gold; }
    List<Artifact> getInventorySnapshot() { return inventorySnapshot; }
}