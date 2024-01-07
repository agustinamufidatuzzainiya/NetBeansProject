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
public class Motor extends Kendaraan {
    private final String[] warna = {"Biru", "Red", "Silver", "Black", "Kuning", "Putih"};
    
    @Override
    protected void warna(){
        int nilaiAcak = (int) (Math.random()*warna.length);
        String warnaKendaraan = warna[nilaiAcak];
        System.out.println(warna[nilaiAcak]);
    }
   
    @Override
    protected void jumlahRoda(){
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.setJumlahRoda("Dua");
        System.out.print(kendaraan.getJumlahRoda());
    }
    
    @Override
    protected void jenisKendaraan(){
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.setJenisKendaraan("Motor");
        System.out.println(kendaraan.getJenisKendaraan());
    }
    
    @Override
    protected void makeNoise(){
        Kendaraan kendaraan = new Kendaraan();
        System.out.println("Ngenggggggg");
    }
}
