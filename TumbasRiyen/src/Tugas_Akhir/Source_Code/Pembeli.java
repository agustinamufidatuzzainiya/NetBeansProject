/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Akhir.Source_Code;

/**
 *
 * @author NoteBook
 */
public class Pembeli{

    private String pembeli, total, alamat, gender, bayar,kembalian;

    public void addpembeli(String pembeli, String gender, String kembalian, String tot, String alamat, String bayar) {
        this.pembeli = pembeli;
        this.gender = gender;
        this.kembalian = kembalian;
        this.alamat = alamat;
        this.total = tot;
        this.bayar = bayar;
    }

    public String pembeli() {
        return pembeli;
    }

    public String gender() {
        return gender;
    }

    public String total() {
        return total;
    }

    public String alamat() {
        return alamat;
    }

    public String bayar() {
        return bayar;
    }
    
    public String kembalian(){
        return kembalian;
    }

}
