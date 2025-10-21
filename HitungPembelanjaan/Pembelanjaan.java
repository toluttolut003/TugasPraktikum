
package HitungPembelanjaan;

import java.io.*;

public class Pembelanjaan {
    
    static String FILENAME = "pembelanjaan.bin";
    
    public static void main(String[] args) throws IOException {
        InputData("Abdul", 850000.00, 15.0);
        TampilData();
    }
    
    public static void InputData(String nama, double totalBelanja, double diskonPersen) throws FileNotFoundException, IOException{
        
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILENAME))){
            dos.writeUTF(nama);
            dos.writeDouble(totalBelanja);
            dos.writeDouble(diskonPersen);
            System.out.println("data berhasil di inputkan");
        } catch (IOException e) {
            System.out.println("Ada kesalahan");
        }
        
    }
    
    public static void TampilData(){
        double uangDibayar = 1000000.00;
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILENAME))) {
            String nama = dis.readUTF();
            double totalBelanja = dis.readDouble();
            double diskonPersen = dis.readDouble();

            double jumlahDiskon = totalBelanja * (diskonPersen / 100.0);
            
            double totalBayar = totalBelanja - jumlahDiskon;
            
            double kembalian = uangDibayar - totalBayar;

            System.out.println("=========================================");
            System.out.println("           LAPORAN PEMBELANJAAN          ");
            System.out.println("=========================================");
            
            System.out.printf("Nama           : %s%n", nama);
            System.out.printf("Total Belanja  : Rp %,.2f%n", totalBelanja);
            System.out.printf("Diskon (%%)     : %.0f%%%n", diskonPersen);
            System.out.println("-----------------------------------------");
            
            System.out.printf("Total Bayar    : Rp %,.2f%n", totalBayar);
            System.out.printf("Bayar          : Rp %,.2f%n", uangDibayar);
            System.out.printf("Kembalian      : Rp %,.2f%n", kembalian);
            System.out.println("=========================================");
            
        } catch (FileNotFoundException e) {
            System.err.println("File tidak ditemukan: " + FILENAME);
        } catch (IOException e) {
            System.err.println("Kesalahan saat membaca data: " + e.getMessage());
        }
    
    }
    
}
