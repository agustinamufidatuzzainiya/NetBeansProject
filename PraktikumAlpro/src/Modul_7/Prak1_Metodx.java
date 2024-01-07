/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_7;

/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
public class Prak1_Metodx {
    //fungsi
    public double luas_lingkaran(int diameter){
        int jari2 = diameter/2;
        double luas = Math.PI * Math.pow(jari2,2);
        return luas;
    }
    //prosedur
    public void hitungLuasLingkaran(int jari2){
        double luas = Math.PI * Math.pow(jari2,2);
        System.out.println(luas);
    }
    public static void main(String[] args) {
        Prak1_Metodx mt = new Prak1_Metodx();
        mt.hitungLuasLingkaran(10);
        System.out.println(mt.luas_lingkaran(20));
        System.exit(0);
    }
}
