
package ScannerVSbufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PerbedaanScannerDanBufferReader {
    
    //Perbedaannya 
    //Scanner       : dapat membaca token dengan tipe data spesifik (nextInt(), nextDouble()).
    //BufferReader  : Hanya membaca String (readLine()). Membutuhkan konversi manual ke tipe data lain (Integer.parseInt()).
    //contoh
    
    
    public static void main(String[] args) throws IOException {
        
        
        Scanner("Tolut", 7);
        BufferReader("Tomlut", 9);
        
        
    }
    
    public static void Scanner (String nama, int kelas){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan nama : " );
        nama = scanner.nextLine(); //Scanner punya banyak fungsi untuk inputan selain string
        
        System.out.println("Masukan Kelas 1-7 : " );
        kelas = scanner.nextInt();
        
        System.out.println("===========================");
        System.out.println("        Scanner            ");
        System.out.println("===========================");
        System.out.println("Nama anda adalah : "+nama);
        System.out.println("Kelas : " + kelas);
    }
    
    public static void BufferReader (String nama, int kelas) throws IOException{
        
        
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan nama : ");
            nama = buffer.readLine();
        
        System.out.println("Masukan Kelas 1-7 : ");
            String kelasint = buffer.readLine(); //deklarasi wadah untuk string untuk menyimbal value int yg telah di ubah
            kelas = Integer.parseInt(kelasint); //BufferReader harus merubah integer ke String dulu
            
        System.out.println("===========================");
        System.out.println("        BufferReader          ");
        System.out.println("===========================");
        System.out.println("Nama anda adalah : "+nama);
        System.out.println("Kelas : " + kelas);
    }
}
