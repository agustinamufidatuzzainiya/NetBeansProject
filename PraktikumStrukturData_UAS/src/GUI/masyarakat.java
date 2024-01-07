/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
public class masyarakat {
    public int data;
    public String nama;
    public int noRumah;
    public int noKK;
    public String noTelp;
    public int jumlah;

    public masyarakat(String nama, int noRumah, int noKK, String noTelp, int jumlah) {
        this.data = data;
        this.nama = nama;
        this.noRumah = noRumah;
        this.noKK = noKK;
        this.noTelp = noTelp;
        this.jumlah = jumlah;
    }
    
    public int getKey(){
        return data;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getNoRumah(){
        return noRumah;
    }
    
    public int getNoKK(){
        return noKK;
    }
    
    public String getNoTelp(){
        return noTelp;
    }
    
    public int getJumlah(){
        return jumlah;
    }
}
