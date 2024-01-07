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
public class Avanza extends Mobil{
    
    @Override
    protected void platNomor(){
        Avanza ava = new Avanza();
        String[] huruf = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int nilaiAcak1 = (int) (Math.random()*huruf.length);
        int nilaiAcak2 = (int) (Math.random()*huruf.length);
        int nilaiAcak3 = (int) (Math.random()*huruf.length);
        String hurufAcak1 = huruf[nilaiAcak1];
        String hurufAcak2 = huruf[nilaiAcak2];
        String hurufAcak3 = huruf[nilaiAcak3];
        int nilaiAcak4 = (int) (1 + Math.random()*10000);
        ava.setPlatNomor(hurufAcak1 + " " + nilaiAcak4 + " " + hurufAcak2 + "" + hurufAcak3);
        
        System.out.println(ava.getPlatNomor());
    }
    
    @Override
    protected void transmisi(){
        Avanza ava = new Avanza();
        ava.setTransmisi("Automatic");
        
        System.out.println(ava.getTransmisi());
    }
    
    @Override
    protected void merk(){
        Avanza ava = new Avanza();
        ava.setMerk("Toyota Avanza");
        
        System.out.println(ava.getMerk());
    }
    
    @Override
    protected void kapasitasTangki(){
        Avanza ava = new Avanza();
        ava.setKapasitasTangki(45);
        
        System.out.print(ava.getKapasitasTangki());
    }

    @Override
    protected void kecepatan(){
        Avanza ava = new Avanza();
        ava.setKecepatan(1329);
        
        System.out.println(ava.getKecepatan());
    }

    @Override
    protected void harga(){
        Avanza ava = new Avanza();
        ava.setHarga(31750000);
        
        System.out.println(ava.getHarga());
    }
}
