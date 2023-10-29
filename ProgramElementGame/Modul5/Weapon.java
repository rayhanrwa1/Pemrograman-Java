package Modul5;

public abstract class Weapon {
    protected String name;
    protected double damage;

    public Element element;
    public Weapon(String name){
        this.name = name;

        if (this instanceof Gun){
            this.damage = 100;
        }
    }
    public abstract void weapondamage();
}
