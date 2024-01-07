package UAS;

public class PerulanganFor {
    public static void main(String[] args) {
        System.out.println("Program Perhitungan Tahun Kabisat dari Tahun 1600-2021"
            + "\n==================================");
        for(int a = 1600; a <= 2021; a++){
            if (a % 400 == 0 || a % 4 == 0){
                System.out.println(a+" Merupakan Tahun Kabisat");
            }
        }
    }
}