package UTSPBO;
public class PemberiPakan {
private double jumlah;
private int waktu;

public double getJumlah (){
    return jumlah;
}
public void setJumlah(double c){
    this.jumlah = c;
}
public int getWaktu(){
    return waktu;
}
public void setWaktu(int d){
    this.waktu = d;
}
void aturan_pakan (){
    System.out.println("(Mesin Pemberi pakan dinyalakan)");
    System.out.println("Jumlah Pakan " + getJumlah() + " Kg setiap pemberian pakan");
    System.out.println("pakan di berikan setiap " + getWaktu() + " kali per hari");
    }
}