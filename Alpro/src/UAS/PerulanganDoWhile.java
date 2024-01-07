package UAS;

public class PerulanganDoWhile {
    public static void main(String[] args) {
        System.out.println("Program Perhitungan Tahun Kabisat dari Tahun 1600-2021"
                + "\n===================================");
        int a = 1600;
        do{
            if(a % 400 == 0 || a% 4 == 0){
                System.out.println(a+" Merupakan Tahun kabisat");
            }a++;
        }while (a <= 2021);
    }
}