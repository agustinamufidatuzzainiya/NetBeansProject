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
public class Mobil extends Kendaraan {
    private final String[] warna = {"White", "Red", "Black"};
    
    @Override
    protected void warna(){
        int nilaiAcak = (int) (Math.random()*warna.length);
        String warnaKendaraan = warna[nilaiAcak];
        System.out.println(warna[nilaiAcak]);
    }
   
    @Override
    protected void jumlahRoda(){
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.setJumlahRoda("Empat");
        System.out.print(kendaraan.getJumlahRoda());
    }
    
    @Override
    protected void jenisKendaraan(){
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.setJenisKendaraan("Mobil");
        System.out.println(kendaraan.getJenisKendaraan());
    }
    
    @Override
    protected void makeNoise(){
        Kendaraan kendaraan = new Kendaraan();
        System.out.println("Brummmmmmmmmmm");
    }
}
