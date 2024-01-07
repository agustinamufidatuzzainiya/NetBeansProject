/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursi;

/**
 *
 * @author Agustina Mufidatuzzainiya
 */
public class menara_hanoi {
    static int i = 1;

    public static void main(String[] args) {
        // doMenara(3, 'A', 'B', 'C');
        // doMenara(5, 'A', 'B', 'C');
        int jumlahcakram = 4;
        doMenara(jumlahcakram, 'A', 'B', 'C');
    }

    public static void doMenara(int cakram, char tiangawal, 
            char tiangbantu, char tiangfinish) {
        if (cakram == 1) {
            System.out.println((i++) + "\tPindahkan cakram 1 dari tiang " 
                    + tiangawal + " ke tiang " + tiangfinish);
            return;
        } else {
            doMenara(cakram - 1, tiangawal, tiangfinish, tiangbantu);
            System.out.println((i++) + "\tpindahkan cakram " 
                    + cakram + " dari tiang " + tiangawal + " ke tiang " + tiangfinish);
            doMenara(cakram - 1, tiangbantu, tiangawal, tiangfinish);
        }
    }
}
