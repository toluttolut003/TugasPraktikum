package PBOT2_Tolut_IFA24_5520124031;

/**
 *
 * @author Tolut
 */
public class Soal {
    public static void Increment(int i, int n){
    for (i = 0; i < n; i++){
        System.out.println("iterasi ke -" + i);
        }
    }
}

class PersegiPanjang {
    //NOTE >>>gunakan keyword static agar method langsung bisa di panggil di main tanpa harus membuat objek dulu<<<<<<
    static double panjang = 50f;
    static double lebar = 45f;
    static double luas;
    public static void HitungLuas() {
        luas = panjang * lebar;
        System.out.println("Hitung luas " + panjang + " x " + lebar + " adalah : " + luas);
    }
    
}

class PersamaanKuadrat {
    static int a = 2;
    static int b = 10;
    static int c = 5;
    static int D;
    public static void HitungPersamaan (){
        D = b*b - 4*a*c;
        System.out.println("hasil dari rumus hitung Diskriminan Persamaan kuadrat " + b + "^2 - 4*" + a + "*" + c + " adalah : " + D);
        }
    }

class OperasiMatematika {
    
    static int x = 22;
    static int y = 33;
    static int penjumlahan,pengurangan,perkalian;
    static double pembagian;
    public static void OperasiAritmatik(){
        penjumlahan = x+y;
        pengurangan = x-y;
        perkalian = x*y;
        pembagian = x/2;
        
        System.out.println("Operasi Aritmatika x=" + x + " dan y=" + y + " : ");
        System.out.println("Penjumlahan x+y = " + penjumlahan);
        System.out.println("Pengurangan x-y = " +pengurangan);
        System.out.println("Perkalian x*y = " + perkalian);
        System.out.println("Pembagian x/2 = " + pembagian);
        
        }

}

class Segitiga {
    static int a = 6;
    static int b = 8;
    static float L;
    static double c,K;
    public static void HitungLuas(){
        L = 0.5f * b * a;
        System.out.println("Luas dari segitiga dengan alas = " + b + ", dan tinggi = " + a + " adalah : " + L);
        
    }
    
    public static void HitungSisiMiring (){
        
        L=(a*a)+(b*b);
        c = Math.sqrt(L); 
        K = a+b+c;
        System.out.println("Nilai c dari segitiga dengan alas = " + b + ", dan tinggi = " + a + " adalah : " + c);
        System.out.println("dan Keliling dari segitiga dengan alas = " + b + ", dan tinggi = " + a + ", dan c = "+c +" adalah : " + K);
    }
}

class OperasiString{
    
    static String a = "saya belajar bava";
    static String b = "SAYA BELAJAR JAVA";
    static String Newa,Newb;
    public static void StringChange () {
        Newa = a.toUpperCase();
        Newb = b.toLowerCase();
        System.out.println("String sebelummnya : " + a + " | " + b);
        System.out.println("String Setelah Operasi : " + Newa + " | " + Newb);
    }
    
}

class HitungWaktuTempuh {
    
    static double s2,t2,t,s,v,t2m,WaktuSisa;
    
    public static void HitungWaktu(){
        s = 384400.0; //jarak ke bulan
        s2 = 152000000.1; //jarak ke matahari
        v = 300000.0; //kecepatan
        t = s/v; //tempuh ke bulan
        t2 = s2/v;//tempuh ke matahari
        t2m = t2/60;
       WaktuSisa = Math.round(t2) % 60;
        System.out.println("jika di bulatkan jarak tempuh ke bulan Sekitar : " + Math.round(t) + " detik");
        System.out.println("sedangkan jarak tempuh ke Matahari Sekitar : " + Math.round(t2) + " detik, atau " + Math.round(t2m) + " menit " + WaktuSisa + " detik");
    }
    
}

class KonversiSuhu {
    static double C = 10;
    static double F = 15;
    static double R = 5;
    static double hasil;
    
    public static void CtoF(){
        hasil = (C*1.8)+32;
        System.out.println( Math.round(C) +" Celsius di konversi ke Fahrenheit Menjadi : " + Math.round(hasil) + " Fahrenheit");
        hasil = 0;
    }
    
    public static void FtoC(){
         hasil = (F-32)/1.8;
         System.out.println(Math.round(F) +" Fahrenheit di konversi ke Celcius Menjadi : " + Math.round(hasil) + " Celcius");
         hasil = 0;
    }
    
    public static void CtoR(){
         hasil = C * 0.8;
         System.out.println(Math.round(C) +" Celcius di konversi ke Reamur Menjadi : " + Math.round(hasil) + " Reamur");
         hasil = 0;
    }
    
    public static void RtoC(){
         hasil = R * 0.8;
         System.out.println(Math.round(R) +" Reamur di konversi ke Celcius Menjadi : " + Math.round(hasil) + " Celcius");
         hasil = 0;
    }
    
    public static void FtoR(){
         hasil = (F-32)* 4/9;
         System.out.println(Math.round(F) +" Fahrenheit di konversi ke Reamur Menjadi : " + Math.round(hasil) + " Reamur");
         hasil = 0;
    }
    
    public static void RtoF(){
         hasil = (R*2.25)+32;
         System.out.println(Math.round(R) +" Reamur di konversi ke Fahrenheit Menjadi : " + Math.round(hasil) + " Fahrenheit");
         hasil = 0;
    }
}

