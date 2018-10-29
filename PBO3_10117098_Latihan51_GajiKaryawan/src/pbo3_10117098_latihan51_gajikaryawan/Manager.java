/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan51_gajikaryawan;

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
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

        public float tunjanganKehadiran(int kehadiran) {
        tunjanganKehadiran = 1000 * kehadiran;
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan (String jabatan){
    if (jabatan.equals("Manager")){
        tunjanganJabatan = 2000000;
    } else if (jabatan.equals("Kabag")){
        tunjanganJabatan = 1000000;
    
    } else 
        tunjanganJabatan = 0;
    
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan (int golongan){
        switch (golongan) {
            case 1:
                tunjanganGolongan = 500000;
                break;
            case 2:
                tunjanganGolongan = 1000000;
                break;
            case 3:
                tunjanganGolongan = 1500000;
                break;
            default:
                tunjanganGolongan = 0;
                break;
        }
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganGolongan + tunjanganKehadiran + tunjanganJabatan;
    }
}
