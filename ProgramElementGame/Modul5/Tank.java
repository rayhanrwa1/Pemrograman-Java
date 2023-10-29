package Modul5;

public abstract class Tank extends Hero {
    protected double armorStrength;

    public Tank(int level, double armorStrength) {
        super(level);
        this.armorStrength = armorStrength;
    }

    protected double calculaterealdamage(Hero target) {
        double realDamage = attackDamage - target.defense;
        if (armorStrength > 0) {
            armorStrength--;
            realDamage = 0;
        }
        return realDamage >= 0 ? realDamage : 0;

    }

    protected void spawnintro() {
        System.out.println("I'm an unstoppable tank!!!");
    }

    public double checkArmor(double damage) {
        double remainingArmor = armorStrength - damage;
        if (remainingArmor > 0) {
            return 0;
        } else {
            double remainingDamage = Math.abs(remainingArmor);
            armorStrength = 0;
            return remainingDamage;
        }
    }
}

