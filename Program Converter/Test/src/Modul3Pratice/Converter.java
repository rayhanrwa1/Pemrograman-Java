package Modul3Pratice;


import java.util.Scanner;

public class Converter extends Main{

    protected double ToM;
    protected double ToCM;
    protected double ToFeet;
    protected double ToMiles;

    public double getToM() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Yard: ");
        double yard = input.nextDouble();
        double meter = yard * 0.9144;
        System.out.println("Hasil Konversi  : " + meter );
        return  ToM;
    }

    public void setToM(double toM) {
        ToM = toM;
    }

    public double getToCM() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Yard: ");
        double yard = input.nextDouble();
        double CM = yard * 91.44;
        System.out.println("Hasil Konversi  : " + CM );


        return ToCM;
    }

    public void setToCM(double toCM) {
        ToCM = toCM;
    }

    public double getToFeet() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Yard: ");
        double yard = input.nextDouble();
        double feet = yard * 3;
        System.out.println("Hasil Konversi  : " + feet );
        return ToFeet;
    }

    public void setToFeet(double toFeet) {
        ToFeet = toFeet;
    }

    public double getToMiles() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Yard: ");
        double yard = input.nextDouble();
        double Miles = yard / 1760;
        System.out.println("Hasil Konversi  : " + Miles );

        return ToMiles;
    }

    public void setToMiles(double toMiles) {
        ToMiles = toMiles;
    }
}
