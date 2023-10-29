package Modul5;

public class Sword extends Weapon implements Weaponable{
    public Sword(String name) { super(name); }

    public void useWeaponable() { System.out.println("Weapon: "+name);}

    public void weapondamage() {
        System.out.println("weapon damage: "+damage);
    }
}

