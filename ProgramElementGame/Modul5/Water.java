package Modul5;

public class Water extends Element {
    public Water(String name) { super(name);}
    public void useElement() { System.out.println("Element Damage: Water");}
    public void totalDamage(){
        double hasil = damage + additionalPoint;
        System.out.println("Total damage weapon: "+hasil);

    }
    public void weapondamage(){
        System.out.println("Weapon damage: "+additionalPoint);
        super.weapondamage();
    }
}
