
package SelisihWaktu;

import java.util.Scanner;

public class HitungSelisih {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("PROGRAM HITUNG SELISIH WAKTU (JAM:MENIT)");
		System.out.print("Masukan waktu ke 1 (format J.MM, cth 10.30): ");
		double waktu1 = scanner.nextDouble();
		System.out.print("Masukan Waktu ke 2 (format J.MM, cth 12.00): ");
		double waktu2 = scanner.nextDouble();
		
		MethodSelisih(waktu1, waktu2);
		
	}
	
	public static void MethodSelisih (double waktu1, double waktu2){
        double totalMenit1 = (int) waktu1 * 60 + (waktu1 * 100) % 100;
        double totalMenit2 = (int) waktu2 * 60 + (waktu2 * 100) % 100;
        
        double selisihTotalMenit = Math.abs(totalMenit2 - totalMenit1);
        
        int selisihJam = (int) (selisihTotalMenit / 60);
        int selisihMenit = (int) (selisihTotalMenit % 60);
        
        String waktu1Str = String.format("%.02f", waktu1);
        String waktu2Str = String.format("%.02f", waktu2);
        
        System.out.println("Selisih waktu dari jam " + waktu1Str + " ke jam " + waktu2Str + " adalah:");
        System.out.printf("%d jam %d menit%n", selisihJam, selisihMenit);
	}
	
}
