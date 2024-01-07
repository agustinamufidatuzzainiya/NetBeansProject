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
public class Sigra extends Mobil{
    
    @Override
    protected void platNomor(){
        Sigra sig = new Sigra();
        String[] huruf = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int nilaiAcak1 = (int) (Math.random()*huruf.length);
        int nilaiAcak2 = (int) (Math.random()*huruf.length);
        int nilaiAcak3 = (int) (Math.random()*huruf.length);
        String hurufAcak1 = huruf[nilaiAcak1];
        String hurufAcak2 = huruf[nilaiAcak2];
        String hurufAcak3 = huruf[nilaiAcak3];
        int nilaiAcak4 = (int) (1 + Math.random()*10000);
        sig.setPlatNomor(hurufAcak1 + " " + nilaiAcak4 + " " + hurufAcak2 + "" + hurufAcak3);
        
        System.out.println(sig.getPlatNomor());
    }
    
    @Override
    protected void transmisi(){
        Sigra sig = new Sigra();
        sig.setTransmisi("Automatic");
        
        System.out.println(sig.getTransmisi());
    }
    
    @Override
    protected void merk(){
        Sigra sig = new Sigra();
        sig.setMerk("Daihatsu Sigra");
        
        System.out.println(sig.getMerk());
    }
    
    @Override
    protected void kapasitasTangki(){
        Sigra sig = new Sigra();
        sig.setKapasitasTangki(45);
        
        System.out.print(sig.getKapasitasTangki());
    }

    @Override
    protected void kecepatan(){
        Sigra sig = new Sigra();
        sig.setKecepatan(1329);
        
        System.out.println(sig.getKecepatan());
    }

    @Override
    protected void harga(){
        Sigra sig = new Sigra();
        sig.setHarga(16690000);
        
        System.out.println(sig.getHarga());
    }
}
