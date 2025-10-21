/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WaktuCetak;

import java.util.Scanner;

public class HitungWaktuPencetakan {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        final int DETIK_PER_MENIT = 60;
        final int DETIK_PER_JAM = 3600;
        final int DETIK_PER_HARI = 86400;

        System.out.println("=============================================");
        System.out.println(" PROGRAM HITUNG WAKTU CETAK NOVEL ");
        System.out.println("=============================================");
        
        System.out.print("Masukkan banyaknya novel yang akan dicetak: ");
        int jumlahNovel = scanner.nextInt();

        System.out.print("Masukkan tebal lembar per novel: ");
        int lembarPerNovel = scanner.nextInt();

        long totalLembar = (long) jumlahNovel * lembarPerNovel; 
        long totalWaktuDetik = totalLembar;

        long hari = totalWaktuDetik / DETIK_PER_HARI;
        long sisaDetik = totalWaktuDetik % DETIK_PER_HARI;

        long jam = sisaDetik / DETIK_PER_JAM;
        sisaDetik = sisaDetik % DETIK_PER_JAM;

        long menit = sisaDetik / DETIK_PER_MENIT;
        long detik = sisaDetik % DETIK_PER_MENIT;
        
        System.out.println("\n---------------------------------------------");
        System.out.println("RINGKASAN PERHITUNGAN");
        System.out.printf("Total Lembar dicetak : %,d lembar%n", totalLembar);
        System.out.printf("Total Waktu (Detik)  : %,d detik%n", totalWaktuDetik);
        System.out.println("---------------------------------------------");
        System.out.println("Waktu yang diperlukan untuk menyelesaikan pencetakan adalah:");
        System.out.printf("-> %d Hari, %d Jam, %d Menit, %d Detik%n", hari, jam, menit, detik);
        System.out.println("=============================================");
        
        scanner.close();
    }
}