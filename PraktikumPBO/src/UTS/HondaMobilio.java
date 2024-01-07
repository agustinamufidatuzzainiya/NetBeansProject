/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author MidoriNoKen
 */
public class HondaMobilio extends Mobil{
    
    @Override
    protected void platNomor(){
        HondaMobilio mobi = new HondaMobilio();
        String[] huruf = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int nilaiAcak1 = (int) (Math.random()*huruf.length);
        int nilaiAcak2 = (int) (Math.random()*huruf.length);
        int nilaiAcak3 = (int) (Math.random()*huruf.length);
        String hurufAcak1 = huruf[nilaiAcak1];
        String hurufAcak2 = huruf[nilaiAcak2];
        String hurufAcak3 = huruf[nilaiAcak3];
        int nilaiAcak4 = (int) (1 + Math.random()*10000);
        mobi.setPlatNomor(hurufAcak1 + " " + nilaiAcak4 + " " + hurufAcak2 + "" + hurufAcak3);
        
        System.out.println(mobi.getPlatNomor());
    }
    
    @Override
    protected void transmisi(){
        HondaMobilio mobi = new HondaMobilio();
        mobi.setTransmisi("Automatic");
        
        System.out.println(mobi.getTransmisi());
    }
    
    @Override
    protected void merk(){
        HondaMobilio mobi = new HondaMobilio();
        mobi.setMerk("Honda Mobilio");
        
        System.out.println(mobi.getMerk());
    }
    
    @Override
    protected void kapasitasTangki(){
        HondaMobilio mobi = new HondaMobilio();
        mobi.setKapasitasTangki(45);
        
        System.out.print(mobi.getKapasitasTangki());
    }

    @Override
    protected void kecepatan(){
        HondaMobilio mobi = new HondaMobilio();
        mobi.setKecepatan(1329);
        
        System.out.println(mobi.getKecepatan());
    }

    @Override
    protected void harga(){
        HondaMobilio mobi = new HondaMobilio();
        mobi.setHarga(31750000);
        
        System.out.println(mobi.getHarga());
    }
}
