package Modul_2;

class praktikum2 {
    public static void main(String[] args) {
        long gator = 3500000;
        double pajak = 0.1;
        int potongan = (int) (gator*pajak);
        
        System.out.println("Gaji Kotor = Rp."+gator);
        System.out.println("Potongan = Rp."+potongan);
        System.out.println("Gaji Bersih = Rp."+(gator-potongan));
    }
}