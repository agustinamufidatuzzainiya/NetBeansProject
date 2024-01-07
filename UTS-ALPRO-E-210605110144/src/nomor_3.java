public class nomor_3 {

    public static void main(String[] args) {
    int a,b,c;  
        for (a = 1; a <=5; a++) {           //menggunakan 3 perulangan for
            for (b = 5; b > a; b--) {       //for a, b, c
                System.out.print(" ");      //memberikan spasi
            }
            for (c = 1; c < (2*a); c++) {
                System.out.print("*");      //menampilkan bintang
            }
            System.out.println();
        }
    }
}