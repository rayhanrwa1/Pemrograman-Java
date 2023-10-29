package Tugasmodul6;
import java.util.Arrays;
import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class DeretInteger {
    private final int[] deret;

    public int[] getDeret() {
        return deret;
    }

    public DeretInteger(int jumlahSuku) {
        deret = new int[jumlahSuku];
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < deret.length; i++) {
            try {
                System.out.print("Masukkan elemen ke-" + (i+1) + ": ");
                int input = Integer.parseInt(scanner.nextLine());
                if (input < 0) {
                    throw new NegativeNumberException("Bilangan negatif tidak diperbolehkan!");
                }
                if (input == 0) {
                    throw new IllegalArgumentException("Bilangan 0 tidak diperbolehkan!");
                }
                deret[i] = input;
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa bilangan bulat. Silakan ulangi.");
                i--;
            } catch (NegativeNumberException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }
    }

    public void urutAscending() {
        Arrays.sort(deret);
    }

    public void urutDescending() {
        Arrays.sort(deret);
        for (int i = 0; i < deret.length / 2; i++) {
            int temp = deret[i];
            deret[i] = deret[deret.length - 1 - i];
            deret[deret.length - 1 - i] = temp;
        }
    }

    public int nilaiMaksimal() {
        int maksimal = Integer.MIN_VALUE;
        for (int elemen : deret) {
            maksimal = Math.max(maksimal, elemen);
        }
        return maksimal;
    }

    public int nilaiMinimal() {
        int minimal = Integer.MAX_VALUE;
        for (int elemen : deret) {
            minimal = Math.min(minimal, elemen);
        }
        return minimal;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah suku: ");
        int jumlahSuku = Integer.parseInt(scanner.nextLine());

        DeretInteger deret = new DeretInteger(jumlahSuku);
        deret.input();

        System.out.println("\nDeret yang dimasukkan:");
        for (int elemen : deret.getDeret()) {
            System.out.print(elemen + " ");
        }

        deret.urutAscending();
        System.out.println("\n\nDeret setelah diurutkan secara ascending:");
        for (int elemen : deret.getDeret()) {
            System.out.print(elemen + " ");
        }

        deret.urutDescending();
        System.out.println("\n\nDeret setelah diurutkan secara descending:");
        for (int elemen : deret.getDeret()) {
            System.out.print(elemen + " ");
        }

        int maksimal = deret.nilaiMaksimal();
        System.out.println("\n\nNilai maksimal: " + maksimal);

        int minimal = deret.nilaiMinimal();
        System.out.println("Nilai minimal: " + minimal);
    }
}
