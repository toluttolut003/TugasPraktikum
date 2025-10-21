
package HitungGajihBersih;

import java.util.Scanner;



public class GajihBersih {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nomor Induk Karyawan: ");
        long NIK = scanner.nextLong();//240117001
        
        scanner.nextLine();//gunakan input buffer setelah menggunakan nextInt dan setelahnya adalah nextline
        
        System.out.print("Nama Karyawan : ");//John Doe
        String nama = scanner.nextLine();
        
        System.out.print("Alamat : ");//Jl. Lorem Ipsum, Kecamatan Cianjur, Java barat
        String alamat = scanner.nextLine();
        
        System.out.print("Jabatan : ");//manajer
        String jabatan = scanner.nextLine();
        
        System.out.print("Gajih Pokok : ");//2000000
        Long p1 = scanner.nextLong();
        
        System.out.print("Tunjangan Jabatan : ");//300000
        Long p2 = scanner.nextLong();
        
        System.out.print("Tunjangan Istri : ");//200000
        Long p3 = scanner.nextLong();
        
         System.out.print("Tunjangan Anak : ");//150000
        Long p4 = scanner.nextLong();
        
        double TotalGaji = p1+p2+p3+p4;
        double Pajak = 0.10 * (p1+p2+p4);
        double GajihBersih = TotalGaji - Pajak;
        System.out.println("Total Gaji : " + Math.round(TotalGaji));
        System.out.println("Pajak penghasilan : " + Math.round(Pajak));
        System.out.println("Gaji Bersih : " + Math.round(GajihBersih));
        
        scanner.close();
    }
}