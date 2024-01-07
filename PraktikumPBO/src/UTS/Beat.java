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
public class Beat extends Motor{
    
    @Override
    protected void platNomor(){
        Beat beat = new Beat();
        String[] huruf = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int nilaiAcak1 = (int) (Math.random()*huruf.length);
        int nilaiAcak2 = (int) (Math.random()*huruf.length);
        int nilaiAcak3 = (int) (Math.random()*huruf.length);
        String hurufAcak1 = huruf[nilaiAcak1];
        String hurufAcak2 = huruf[nilaiAcak2];
        String hurufAcak3 = huruf[nilaiAcak3];
        int nilaiAcak4 = (int) (1 + Math.random()*10000);
        beat.setPlatNomor(hurufAcak1 + " " + nilaiAcak4 + " " + hurufAcak2 + "" + hurufAcak3);
        
        System.out.println(beat.getPlatNomor());
    }
    
    @Override
    protected void transmisi(){
        Beat beat = new Beat();
        beat.setTransmisi("Automatic");
        
        System.out.println(beat.getTransmisi());
    }
    
    @Override
    protected void merk(){
        Beat beat = new Beat();
        beat.setMerk("Beat");
        
        System.out.println(beat.getMerk());
    }
    
    @Override
    protected void kapasitasTangki(){
        Beat beat = new Beat();
        beat.setKapasitasTangki(45);
        
        System.out.print(beat.getKapasitasTangki());
    }

    @Override
    protected void kecepatan(){
        Beat beat = new Beat();
        beat.setKecepatan(1329);
        
        System.out.println(beat.getKecepatan());
    }

    @Override
    protected void harga(){
        Beat beat = new Beat();
        beat.setHarga(31750000);
        
        System.out.println(beat.getHarga());
    }
}
