package com.narxoz.rpg.vault;

import com.narxoz.rpg.artifact.GoldAppraiser;
import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.memento.Caretaker;
import java.util.List;

public class ChronomancerEngine {

    public VaultRunResult runVault(List<Hero> party) {
        Caretaker caretaker = new Caretaker();
        int totalAppraised = 0;
        int savedCount = 0;
        int restoredCount = 0;

        for (Hero hero : party) {
            caretaker.save(hero.createMemento());
            savedCount++;

            GoldAppraiser appraiser = new GoldAppraiser();
            hero.getInventory().accept(appraiser);
            totalAppraised += hero.getInventory().size();

            hero.spendGold(50); // Мысалы, 50 алтын жоғалтты

            hero.restoreFromMemento(caretaker.undo());
            restoredCount++;
        }

        return new VaultRunResult(totalAppraised, savedCount, restoredCount);
    }
}