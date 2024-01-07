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
public class PCX extends Motor{
    
    @Override
    protected void platNomor(){
        PCX pcx = new PCX();
        String[] huruf = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int nilaiAcak1 = (int) (Math.random()*huruf.length);
        int nilaiAcak2 = (int) (Math.random()*huruf.length);
        int nilaiAcak3 = (int) (Math.random()*huruf.length);
        String hurufAcak1 = huruf[nilaiAcak1];
        String hurufAcak2 = huruf[nilaiAcak2];
        String hurufAcak3 = huruf[nilaiAcak3];
        int nilaiAcak4 = (int) (1 + Math.random()*10000);
        pcx.setPlatNomor(hurufAcak1 + " " + nilaiAcak4 + " " + hurufAcak2 + "" + hurufAcak3);
        
        System.out.println(pcx.getPlatNomor());
    }
    
    @Override
    protected void transmisi(){
        PCX pcx = new PCX();
        pcx.setTransmisi("Automatic");
        
        System.out.println(pcx.getTransmisi());
    }
    
    @Override
    protected void merk(){
        PCX pcx = new PCX();
        pcx.setMerk("PCX");
        
        System.out.println(pcx.getMerk());
    }
    
    @Override
    protected void kapasitasTangki(){
        PCX pcx = new PCX();
        pcx.setKapasitasTangki(45);
        
        System.out.print(pcx.getKapasitasTangki());
    }

    @Override
    protected void kecepatan(){
        PCX pcx = new PCX();
        pcx.setKecepatan(1329);
        
        System.out.println(pcx.getKecepatan());
    }

    @Override
    protected void harga(){
        PCX pcx = new PCX();
        pcx.setHarga(31750000);
        
        System.out.println(pcx.getHarga());
    }
}
