package com.narxoz.rpg.artifact;
import java.util.*;

public class Inventory {
    private final List<Artifact> artifacts;
    public Inventory() { this.artifacts = new ArrayList<>(); }
    public Inventory(List<Artifact> artifacts) { this.artifacts = new ArrayList<>(artifacts); }
    public void addArtifact(Artifact a) { if (a != null) artifacts.add(a); }
    public List<Artifact> getArtifacts() { return Collections.unmodifiableList(artifacts); }
    public int size() { return artifacts.size(); }
    public void accept(ArtifactVisitor visitor) {
        for (Artifact a : artifacts) a.accept(visitor);
    }
}