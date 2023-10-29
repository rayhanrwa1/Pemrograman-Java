package Modul5;

public class Armor extends Element implements Armorable{
    protected double defesensePoint = 1000;
    public Armor (String name) {super(name);}

    public void useArmorable(){ System.out.print("Armor defense");}
    @Override
    public void weapondamage(){super.weapondamage();}
    @Override
    public void useElement(){
    }
    public void totaldamage(Element use){
        double hasil = defesensePoint + use.additionalPoint;
        System.out.print("Total armor defense: "+hasil);
        super.totalDamage(use);
    }
}
