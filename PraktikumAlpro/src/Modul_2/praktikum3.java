package Modul_2;

class praktikum3 {
    public static void main(String[] args) {
        int biayahj = 50000000;
        int TabunganRumah = 20000000;
        int tabunganawal = 10000000;
        int deposito = 10000000;
        int cicilanawal = 30000000;
        int waktu = 23;
        int cicilan = (cicilanawal/waktu);
        
        System.out.println("Biaya Haji          = Rp."+biayahj);
        System.out.println("Tabungan Rumah      = Rp."+TabunganRumah);
        System.out.println("Tabungan Awal       = Rp."+tabunganawal);
        System.out.println("Jumlah Deposit      = Rp."+deposito);
        System.out.println("Jumlah Cicilan Awal = Rp."+cicilanawal);
        System.out.println("Cicilan Tiap Bulan  = Rp."+cicilan);
        
    }
}