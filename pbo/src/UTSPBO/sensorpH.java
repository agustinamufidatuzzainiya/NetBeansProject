package UTSPBO;
public class sensorpH {
    private double PH;
    public double getPH() {
    return PH;
    }
        public void setPH(double c) {
        this.PH = c;
    }
        void KondisiPh() {
        PenyaringAir d = new PenyaringAir();
            if (getPH() > 6 && getPH() < 8) {
                System.out.println("(PH Air Sudah Sesuai)");
                System.out.println("(Filter Air Tidak Dinyalakan)");
                System.out.println("PH Air Sekarang: " + getPH() + " %");
        } else if (getPH() < 6) {
            d.Generator_Karbondioksida();
            d.Heater();
            setPH(7);
            System.out.println("PH Sekarang: " + getPH());

        } else {
            d.Generator_Oksigen();
            d.Cooler();
            setPH(7);
            System.out.println("PH Sekarang: " + getPH());
        }
            System.out.println(" ");
    }
}