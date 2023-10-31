import java.util.Scanner;

/**
 * Dokumentasi :
 *
 * Program ini adalah Kalkulator untuk Konversi IPv4 ke Bentuk Biner.
 * Mengambil alamat IPv4 dalam format desimal titik (contoh: 192.168.1.1),
 * mengonversinya menjadi bentuk biner, dan menampilkannya kepada pengguna.
 *
 * Dibuat oleh: Rayhan Rizky Widi Ananta (202210370311470)
 */

public final class Main {

    /**
     * Metode InputIP digunakan untuk mengambil input alamat IPv4 dari pengguna,
     * mengonversinya menjadi bentuk biner, dan menampilkannya.
     */
    public void InputIP(){
        Scanner inputip = new Scanner(System.in);
        System.out.print("Masukkan alamat IPv4 (contoh: 192.168.1.1): ");
        String ipAddress = inputip.nextLine();
        inputip.close();

        String[] octets = ipAddress.split("\\.");


        if (octets.length != 4) {
            System.out.println("Format alamat IPv4 tidak valid.");
            return;
        }


        StringBuilder binaryIP = new StringBuilder();

        for (String octet : octets) {
            try {
                int decimal = Integer.parseInt(octet);
                if (decimal < 0 || decimal > 255) {
                    System.out.println("Format alamat IPv4 tidak valid.");
                    return;
                }
                String binary = Integer.toBinaryString(decimal);

                while (binary.length() < 8) {
                    binary = "0" + binary;
                }
                binaryIP.append(binary).append(".");
            } catch (NumberFormatException e) {
                System.out.println("Format alamat IPv4 tidak valid.");
                return;
            }
        }

        binaryIP.deleteCharAt(binaryIP.length() - 1);

        System.out.println("Alamat IPv4 dalam bentuk biner: " + binaryIP.toString());

    }

    /**
     * Metode main yang merupakan metode utama program untuk memulai eksekusi.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
    Main main = new Main();
    main.InputIP();
    }
}