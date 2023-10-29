package Modul5;

public class Mage extends Hero implements MagicalDamage{
    public Mage(int level){
        super(level);
        attackDamage += attackDamage * magicalDamage;
    }

    protected double calculaterealdamage(Hero target) {
        double realDamage = attackDamage - target.defense;
        return realDamage >= 0 ? realDamage : 0;

    }
    protected void spawnIntro() {
        System.out.println("Prepare to be amazed by my magic!");

    }

}
