/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleSorting;

class Mahasiswa {
    private long nim;
    private String nama;
    private String asal;
    
    public Mahasiswa(long nim, String nama, String asal) {
        this.nim = nim;
        this.nama = nama;
        this.asal = asal;
    } 
    public void displayMhs() {
        System.out.print("\tNim: "+ nim);
        System.out.print(", Nama: "+ nama);
        System.out.println(", Asal: "+ asal);
    }
    public long getNim() {
        return nim;
    }
    public String getName(){
        return nama;
    }
}
