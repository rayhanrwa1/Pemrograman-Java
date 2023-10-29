package Modul5;

public class Assassin extends Hero implements CriticalDamage {
    private String Weapon;
    private String Element;

    public Assassin(int level, String Weapon, String Element) {
        super(level);
        this.Weapon = Weapon;
        this.Element = Element;

        attackDamage += attackDamage * bonusDamage;
        if (Element != null) {
            attackDamage += 100;
        }
    }

    @Override
    protected double calculaterealdamage(Hero target) {
        double realDamage = attackDamage - target.defense;
        return realDamage >= 0 ? realDamage : 0;
    }

    @Override
    protected void spawnIntro(){
        System.out.println("Kill me if u can!!!");
    }
    public void useWeapon() {
        System.out.println("Weapon: +weapon");
    }
    public void useElement(){
        System.out.println("Weapon Element: "+Element);
    }


}
