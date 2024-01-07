package Modul_2;

class pendahuluan5 {
    public static void main(String[] args) {
        int a,b,c, penjumlahan, pengurangan;
        a=10;
        b=7;
        c=3;
        penjumlahan = a+b;
        pengurangan = b-c;
        
        boolean hasil1, hasil2, hasil3;
        hasil1 = a>b;
        hasil2 = a<c;
        hasil3 = b!=c;
        
        System.out.println("== Operator Perbandingan ==");
        System.out.println("Hasil 1 = "+hasil1);
        System.out.println("Hasil 2 = "+hasil2);
        System.out.println("Hasil 3 = "+hasil3);
        
        System.out.println("== Operator Increment ==");
        System.out.println("Hasil 1 = "+ ++a);
        System.out.println("Hasil 2 = "+ a++);
        
        System.out.println("== Operator Decrement ==");
        System.out.println("Hasil 3 = "+ --c);
        System.out.println("Hasil 4 = "+ c--);
        
        System.out.println("== Operator Aritmatika ==");
        System.out.println("Hasil aritmatika 1 = "+ penjumlahan);
        System.out.println("Hasil aritmatika 2 = "+ pengurangan);
    }
}