package com.narxoz.rpg.memento;
import com.narxoz.rpg.combatant.HeroMemento;
import java.util.Stack;

public class Caretaker {
    private final Stack<HeroMemento> history = new Stack<>();
    public void save(HeroMemento m) { if (m != null) history.push(m); }
    public HeroMemento undo() { return history.isEmpty() ? null : history.pop(); }
}