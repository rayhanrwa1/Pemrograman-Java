package codelabtitik4;

public class Zombie {
    protected int health;

    public Zombie(int health) {
        this.health = health;
    }

    public void destroyed() {
        health -= (health * 0.4);
    }

    public String getZombieInfo() {
        return "Zombie\nHealth: " + health;
    }
}
