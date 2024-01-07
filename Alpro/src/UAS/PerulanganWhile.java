package UAS;

public class PerulanganWhile {
    public static void main(String[] args) {
        System.out.println("Program Perhitungan Tahun Kabisat dari Tahun 1600 - 2021"
                + "\n===================================");
        int a = 1600;
        while(a <= 2021){
            if(a % 400 == 0 || a % 4 == 0){
                System.out.println(a+" Merupakan Tahun Kabisat");
            }a++;
        }
    }
}