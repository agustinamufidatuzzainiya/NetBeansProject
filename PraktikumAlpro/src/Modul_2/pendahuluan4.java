package Modul_2;

class pendahuluan4 {
    public static void main(String[] args) {
        
        String zoo = "100";
        int a = Integer.valueOf(zoo);
        float b = Float.valueOf(zoo);
        short c = Short.valueOf(zoo);
        boolean d = Boolean.valueOf(zoo);
        long e = Long.valueOf(zoo);
        
        System.out.println("konversi pertama = " + zoo + " Integer = " + a);
        System.out.println("konversi kedua = " + zoo + " Float = " + b);
        System.out.println("konversi ketiga = " + zoo + " Short = " + c);
        System.out.println("konversi keempat = " + zoo + " Boolean = " + d);
        System.out.println("konversi kelima = " + zoo + " Long = " + e);
        
    }
}