package com.narxoz.rpg.combatant;
import com.narxoz.rpg.artifact.Inventory;

public class Hero {
    private final String name;
    private int hp, mana, gold;
    private final int maxHp, attackPower, defense;
    private Inventory inventory;

    public Hero(String name, int hp, int mana, int attackPower, int defense, int gold, Inventory inv) {
        this.name = name; this.hp = hp; this.maxHp = hp;
        this.mana = mana; this.attackPower = attackPower;
        this.defense = defense; this.gold = gold;
        this.inventory = inv != null ? inv : new Inventory();
    }

    public HeroMemento createMemento() {
        return new HeroMemento(name, hp, mana, gold, maxHp, attackPower, defense, inventory.getArtifacts());
    }

    public void restoreFromMemento(HeroMemento m) {
        if (m == null) return;
        this.hp = m.getHp();
        this.mana = m.getMana();
        this.gold = m.getGold();
        this.inventory = new Inventory(m.getInventorySnapshot());
    }

    public void takeDamage(int dmg) { this.hp = Math.max(0, this.hp - dmg); }
    public void loseGold(int g) { this.gold = Math.max(0, this.gold - g); }
    public Inventory getInventory() { return inventory; }
    public String getName() { return name; }

    @Override
    public String toString() { return name + " [HP:" + hp + ", Gold:" + gold + "]"; }

    public void spendGold(int i) {
    }
}