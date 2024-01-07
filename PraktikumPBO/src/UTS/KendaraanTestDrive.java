/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author Agustina Mufidatuzzainiya
 */
public class KendaraanTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("LIST KENDARAAN DI TOKO");
        System.out.println("----------------------");
        Kendaraan[] kendaraan = new Kendaraan[6];
        kendaraan[0] = new Avanza();
        kendaraan[1] = new HondaMobilio();
        kendaraan[2] = new Sigra();
        kendaraan[3] = new Beat();
        kendaraan[4] = new PCX();
        kendaraan[5] = new Scoopy();
        
        for (int i = 0; i < kendaraan.length; i++) {
            if (i < 3) {
                System.out.println("===== MOBIL =====");
                System.out.print("Detail kendaraan (Roda ");
                kendaraan[i].jumlahRoda();
                System.out.println(")\t: ");
            } else if (i < 6) {
                System.out.println("===== MOTOR =====");
            } else {
                System.out.println("Error : Nilai i tidak tersedia");
            }
            System.out.print("Plat Nomor\t\t\t: ");
            kendaraan[i].platNomor();
            System.out.print("Transmisi\t\t\t: ");
            kendaraan[i].transmisi();
            System.out.print("Merk\t\t\t\t: ");
            kendaraan[i].merk();
            System.out.print("Kapasitas tangki\t\t: ");
            kendaraan[i].kapasitasTangki();
            System.out.print(" Liter \nWarna\t\t\t\t: ");
            kendaraan[i].warna();
            System.out.print("Jenis kendaraan\t\t\t: ");
            kendaraan[i].jenisKendaraan();
            System.out.println("");
        }
    }
}
