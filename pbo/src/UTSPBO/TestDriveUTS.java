package UTSPBO;
import java.util.Scanner;
public class TestDriveUTS {
    
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("== Pemindaian Menggunakan Sensor ==");
    sensorpH a = new sensorpH();
    a.setPH(Math.random());
        SensorCahaya b = new SensorCahaya();
    b.setCahaya(Math.random());
        System.out.println("PH Awal\t\t\t: " + a.getPH());
        System.out.println("Intenitas Cahaya Awal\t: " + b.getCahaya() + " %");
        System.out.println("\n== MELAKUKAN PENYESUAIAN PARAMETER ==");
    a.KondisiPh();
    b.Lampu();

        System.out.println("== Mengatur mesin Pemberi Makan Ikan ==");
        System.out.print("Jumlah Pakan\t= ");
        double x = input.nextDouble();
            System.out.print("Waktu pemberian\t= ");
        int y = input.nextInt();
            System.out.println(" ");
 
        PemberiPakan c = new PemberiPakan();
        c.setJumlah(x);
        c.setWaktu(y);
        c.aturan_pakan();
    }
}