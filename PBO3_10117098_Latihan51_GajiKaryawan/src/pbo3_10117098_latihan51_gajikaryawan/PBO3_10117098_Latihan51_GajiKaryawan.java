/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan51_gajikaryawan;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : SANTI SUSANTI
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan 
 *                     gaji karyawan sesuai dengan jabatan, golongan, dan jumlah
 *                     kehadirannya yang diinput oleh user.
 */
public class PBO3_10117098_Latihan51_GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
     
        Manager kar = new Manager();

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK\t: ");
        kar.setNik(scn1.next());
        System.out.print("Masukkan Nama\t: ");
        kar.setNama(scn2.nextLine());
        System.out.print("Masukkan Golongan (1/2/3): ");
        kar.setGolongan(scn1.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        kar.setJabatan(scn1.next());
        System.out.print("Masukkan Jumlah Kehadiran \t : ");
        kar.setKehadiran(scn1.nextInt());
                
        System.out.println("");
        
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("NIK\t: "+kar.getNik());
        System.out.println("NAMA\t: "+kar.getNama());
        System.out.println("GOLONGAN: "+kar.getGolongan());
        System.out.println("JABATAN\t: "+kar.getJabatan());
        
        System.out.println("");
        
        System.out.println("TUNJANGAN GOLONGAN\t: "+kar.tunjanganGolongan
        (kar.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: "+kar.tunjanganJabatan
        (kar.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: "+kar.tunjanganKehadiran
        (kar.getKehadiran()));
        
        System.out.println("");
        
        System.out.println("Gaji Total\t: "+kar.gajiTotal());   
    }
    
}
