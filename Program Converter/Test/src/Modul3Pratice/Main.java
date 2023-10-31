package Modul3Pratice;



import java.util.Scanner;
/**
 * @author Rayhan Rizky
 */
public class Main {

    private double Value;

    public static void main(String[] args) {

            Converter conv = new Converter();

        Scanner input = new Scanner(System.in);
        System.out.println(" \n\n\t\t\tYard Converter to M, CM, Feet, & Miles\t\n");

        char opr ='y';
        int pilih;
        do {
            System.out.println("1. Yard to M\n2. Yard to CM\n3. Yard to Feet\n4. Yard to Miles\n");
            System.out.println("Pilih menu : ");
            pilih = input.nextInt();
            if (pilih == 1) {
                conv.getToM();
            } else if (pilih == 2) {
                conv.getToCM();

            } else if (pilih == 3) {
                conv.getToFeet();

            } else if (pilih == 4) {
                conv.getToMiles();
            } else {
                System.out.println(" Inputan salah brooo\n Silahkan Input Lagi..");
            }while (pilih <= 0 || pilih >= 6);
            System.out.print("Apakah anda ingin menghitung lagi? (Y/N) :    ");
            opr = input.next().charAt(0);





        }while (opr == 'y' || opr == 'Y');





    }


    public double getValue() {
        return Value;
    }

    public void setValue(double value) {
        Value = value;
    }


}






