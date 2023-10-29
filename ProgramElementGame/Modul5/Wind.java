package Modul5;

public class Wind extends Element {
    public Wind (String name) {super(name);}

    @Override
    public void totalDamage(Weapon use){
        double total = use.damage + additionalPoint;
        System.out.print("Total damage weapon :" +total);
    }

    @Override
    public void weapondamage() {
        System.out.println("Weapon damage: " + additionalPoint);
        super.weapondamage();
    }
    @Override
    public void useElement(){
        System.out.println("Element Damage: Wind");}
}
