package Modul_2;

class praktikum4 {
    public static void main(String[] args) {
        //menginputkan data matematika
        int a, b, c, d, e, aa;
        a = 2;
        b = 8;
        c = 4;
        d = (int)Math.pow(a, b);
        e = (int)Math.pow(c, c);
        aa = d + e;
        
        System.out.println("jawabannya: ");
        System.out.println("a. " + aa);
        int f, g, bb;
        f = (int)Math.pow(2, 2);
        g = c / f;
        bb = f + g;
        System.out.println("b. " + bb);
    }
}