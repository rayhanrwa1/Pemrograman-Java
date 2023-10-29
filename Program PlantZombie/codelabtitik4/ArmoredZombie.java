package codelabtitik4;

class ArmoredZombie extends Zombie implements Destroyable {
    private int armorStrength;

    public ArmoredZombie(int health, int armor) {
        super(health);
        this.armorStrength = armor;
    }

    public void destroyed() {
        if (armorStrength > 0) {
            armorStrength -= (armorStrength * 0.2);
            if (armorStrength < 0) {
                armorStrength = 0;
            }
        } else {
            health -= (health * 0.2);
        }
    }

    @Override
    public String getZombieInfo() {
        return "Zombie: ArmoredZombie\nHealth: " + health + "\nArmor: " + armorStrength + "\n";
    }

}
