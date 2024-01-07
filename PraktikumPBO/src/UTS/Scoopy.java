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
public class Scoopy extends Motor{
    
    @Override
    protected void platNomor(){
        Scoopy sco = new Scoopy();
        String[] huruf = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int nilaiAcak1 = (int) (Math.random()*huruf.length);
        int nilaiAcak2 = (int) (Math.random()*huruf.length);
        int nilaiAcak3 = (int) (Math.random()*huruf.length);
        String hurufAcak1 = huruf[nilaiAcak1];
        String hurufAcak2 = huruf[nilaiAcak2];
        String hurufAcak3 = huruf[nilaiAcak3];
        int nilaiAcak4 = (int) (1 + Math.random()*10000);
        sco.setPlatNomor(hurufAcak1 + " " + nilaiAcak4 + " " + hurufAcak2 + "" + hurufAcak3);
        
        System.out.println(sco.getPlatNomor());
    }
    
    @Override
    protected void transmisi(){
        Scoopy sco = new Scoopy();
        sco.setTransmisi("Automatic");
        
        System.out.println(sco.getTransmisi());
    }
    
    @Override
    protected void merk(){
        Scoopy sco = new Scoopy();
        sco.setMerk("Scoopy");
        
        System.out.println(sco.getMerk());
    }
    
    @Override
    protected void kapasitasTangki(){
        Scoopy sco = new Scoopy();
        sco.setKapasitasTangki(45);
        
        System.out.print(sco.getKapasitasTangki());
    }

    @Override
    protected void kecepatan(){
        Scoopy sco = new Scoopy();
        sco.setKecepatan(1329);
        
        System.out.println(sco.getKecepatan());
    }

    @Override
    protected void harga(){
        Scoopy sco = new Scoopy();
        sco.setHarga(31750000);
        
        System.out.println(sco.getHarga());
    }
}
