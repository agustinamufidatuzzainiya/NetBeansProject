package UTS;

import java.util.*;
public class nomor_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================= TOP UP PULSA ==================");
        System.out.print("Nama Pelanggan : ");  //input nama pelanggan
        String nama = input.nextLine();
        System.out.println("=================================================");
        System.out.println("" +nama+ " top up pulsa sebanyak : ");  //menampilkan nama dari inputan
        System.out.println("1. Rp. 150.000");
        System.out.println("2. Rp. 100.000");
        System.out.println("3. Rp. 50.000");
        System.out.println("4. Rp. 25.000");
        System.out.println("=================================================");
        System.out.print("Pilih Angka diatas : ");
        int masuk = Integer.parseInt(input.nextLine());
        int bonus, sms, total, awal;
        switch (masuk){
            case 1 :
                awal = 25000;
                System.out.println("=================================================");
                System.out.println("Pulsa Awal Rp." +awal);
                System.out.println("=================================================");
                bonus = 15000;
                total = 150000 + bonus + awal;
                sms = 150;
                System.out.println("Isi pulsa Rp. 150.000\nPulsa Bonus Rp. " +bonus+ 
                                   " \nTotal Pulsa Rp. " +total+ " \nBonus SMS sebanyak " +sms);
                System.out.println("=================================================");
                break;
            case 2 :
                awal = 25000;
                System.out.println("=================================================");
                System.out.println("Pulsa Awal Rp." +awal);
                System.out.println("=================================================");
                bonus = 10000;
                total = 100000 + bonus + awal;
                sms = 100;
                System.out.println("Isi pulsa Rp. 100.000\nPulsa Bonus Rp. " +bonus+ 
                                   "\nTotal Pulsa Rp. " +total+ "\nBonus SMS sebanyak " +sms);
                System.out.println("=================================================");
                break;
            case 3 :
                awal = 25000;
                System.out.println("=================================================");
                System.out.println("Pulsa Awal Rp." +awal);
                System.out.println("=================================================");
                bonus = 0;
                total = 50000 + bonus + awal;
                sms = 50;
                System.out.println("Isi pulsa Rp. 50.000\nPulsa Bonus Rp. " +bonus+ 
                                   " [tanpa bonus]\nTotal Pulsa Rp. " +total+" \nBonus SMS sebanyak " +sms);
                System.out.println("=================================================");
                break;
            case 4 :
                awal = 25000;
                System.out.println("=================================================");
                System.out.println("Pulsa Awal Rp." +awal);
                System.out.println("=================================================");
                bonus = 0;
                total = 25000 + bonus + awal;
                System.out.println("Isi pulsa Rp. 25.000\nPulsa Bonus Rp. " +bonus+
                                   "  [tanpa bonus]\nTotal Pulsa Rp. " +total+ " \nTidak memperoleh Bonus SMS");
                System.out.println("=================================================");
                break;
            default :
                System.out.println("=================================================");
                System.out.println("Tidak ada dalam daftar pilihan ");
                System.out.println("=================================================");
                break;
        }
        System.out.println();
    }
    
}
