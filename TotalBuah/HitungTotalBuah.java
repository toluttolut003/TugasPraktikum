package TotalBuah;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HitungTotalBuah {

    public static void main(String[] args) {
        
        int manggaAwal = 70;
        int jumlahTetangga = 4;
        int jambuPerTetangga = 30;
        
        int manggaBusuk = 0; 
        
        int totalJambu = jumlahTetangga * jambuPerTetangga;
        int manggaBersih;
        int totalBuahDibeli;

        System.out.println("=================================================");
        System.out.println(" PROGRAM PENGHITUNGAN BUAH IBU SISCA ");
        System.out.println("=================================================");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Masukkan jumlah mangga yang busuk (sesuai pengembalian): ");
            
            String inputBusuk = reader.readLine();
            
            manggaBusuk = Integer.parseInt(inputBusuk);
            
            System.out.println("\nData berhasil diinput");
            
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat membaca input");
            return;
        } catch (NumberFormatException e) {
            System.err.println("Input tidak valid! Harap masukkan angka bulat");
            return;
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        manggaBersih = manggaAwal - manggaBusuk;
        
        totalBuahDibeli = manggaAwal + totalJambu;
        
        int totalBuahTersedia = manggaBersih + totalJambu;
        
        System.out.println("=================================================");
        System.out.println("1. Pembelian Mangga Awal    : " + manggaAwal + " pcs");
        System.out.println("2. Total Jambu Dibeli       : " + totalJambu + " pcs (" + jumlahTetangga + " x " + jambuPerTetangga + ")");
        System.out.println("3. Mangga yang Dikembalikan : " + manggaBusuk + " pcs");
        System.out.println("-------------------------------------------------");
        
        System.out.println("Total Buah (Mangga & Jambu) yang dibeli di minimarket adalah: " + totalBuahDibeli + " pcs");
        System.out.println("(Total buah yang tersisa dan tidak busuk: " + totalBuahTersedia + " pcs)");
        System.out.println("=================================================");
    }
}