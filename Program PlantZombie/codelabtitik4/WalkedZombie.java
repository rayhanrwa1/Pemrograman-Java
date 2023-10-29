package codelabtitik4;

public class WalkedZombie extends Zombie implements Destroyable {
    public WalkedZombie(int health) {
        super(health);
    }

    @Override
    public String getZombieInfo() {
        return "Zombie: WalkedZombie\nHealth: " + health  + "\n";
    }
    @Override
    public void destroyed() {
        health -= (health * 0.3);
    }

}
