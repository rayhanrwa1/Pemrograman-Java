package Modul5;

public class Fire extends Element {
    public Fire(String name) {
        super(name);}

    @Override
    public void useElement() {
        System.out.println("Weapon element: FIre");}

    @Override
    public void totalDamage(Weapon use) {
        double total = use.damage + additionalPoint;
        System.out.println("Total damage weapon: " + total);

    }

    @Override
    public void weapondamage() {
        System.out.println("Element damage: " + additionalPoint);
    }
}
