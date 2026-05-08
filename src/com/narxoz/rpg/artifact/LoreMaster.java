package com.narxoz.rpg.artifact;

public class LoreMaster implements ArtifactVisitor {
    @Override public void visit(Weapon w) { System.out.println("Қару: " + w.getName() + " (+"+w.getAttackBonus()+" attack)"); }
    @Override public void visit(Potion p) { System.out.println("Поушн: " + p.getName() + " ("+p.getHealing()+" HP)"); }
    @Override public void visit(Scroll s) { System.out.println("Шиыршық: " + s.getName() + " ("+s.getSpellName()+")"); }
    @Override public void visit(Ring r) { System.out.println("Жүзік: " + r.getName() + " (+"+r.getMagicBonus()+" mana)"); }
    @Override public void visit(Armor a) { System.out.println("Сауыт: " + a.getName() + " (+"+a.getDefenseBonus()+" def)"); }
}