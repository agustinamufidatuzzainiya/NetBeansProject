package UTSPBO;
public class SensorCahaya {
    private double Intensitas_Cahaya;
    public double getCahaya() {
    return Intensitas_Cahaya;
    }
        public void setCahaya(double b) {
        this.Intensitas_Cahaya = b;
    }
    void Lampu() {
 
    if (getCahaya() > 50) {
        System.out.println("(intensitas cahaya Sudah Sesuai)");
        System.out.println("Intensitas Cahaya Sekarang: " + getCahaya() + " %");
    } else {
        System.out.println("(Menyalakan Lampu)");
        setCahaya(50);
        System.out.println("Intensitas Cahaya Sekarang: " + getCahaya() + " %");
    }
        System.out.println(" ");
    }
}