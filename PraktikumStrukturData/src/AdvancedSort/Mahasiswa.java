/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvancedSort;

/**
 *
 * @author Agustina Mufidatuzzzainiya_210605110144
 */
public class Mahasiswa {
    private long nim;
    private String nama;
    private String asal;
    
    public Mahasiswa(long nim, String nama, String asal) {
        this.nim = nim;
        this.nama = nama;
        this.asal = asal;
    }

    public void displayMhs() {
        System.out.print("\tNIM: " + nim);
        System.out.print(", Nama: " + nama);
        System.out.println(", Asal: " + asal);
    }
                //Agustina Mufidatuzzzainiya_210605110144
    public long getNim() {
        return nim;
    }
    public void setNim(long nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return asal;        
    }
            //Agustina Mufidatuzzzainiya_210605110144
    public void setAsal(String asal) {
        this.asal = asal;
    }
}
