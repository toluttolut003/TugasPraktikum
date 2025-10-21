
package GayaSentripetal;

import java.util.Scanner;

public class Sentripetal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("  Program Menghitung Gaya Sentripetal (Fc) ");
        System.out.println("=========================================");
        
        System.out.print("Masukkan nilai Massa (m) dalam kg: ");
        double massa = scanner.nextDouble();

        System.out.print("Masukkan nilai Kecepatan (v) dalam m/s: ");
        double kecepatan = scanner.nextDouble();

        System.out.print("Masukkan nilai Jari-jari (r) dalam meter: ");
        double jariJari = scanner.nextDouble();
        
        if (jariJari == 0) {
            System.out.println("\n[ERROR] Jari-jari (r) tidak boleh nol. Perhitungan dibatalkan.");
            scanner.close();
            return;
        }

        double gayaSentripetal = (massa * Math.pow(kecepatan, 2)) / jariJari;
        
        System.out.println("\n-----------------------------------------");
        System.out.println("RUMUS: Fc = (m * v^2) / r");
        System.out.printf("Fc = (%.2f kg * %.2f^2 m/s) / %.2f m%n", massa, kecepatan, jariJari);
        System.out.println("-----------------------------------------");
        System.out.printf("Gaya Sentripetal (Fc) adalah: %.4f Newton%n", gayaSentripetal);
        System.out.println("=========================================");

        scanner.close();
    }
}
