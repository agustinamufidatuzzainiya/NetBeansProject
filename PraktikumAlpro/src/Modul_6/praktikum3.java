/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6;

/**
 *
 * @author niya
 */
public class praktikum3 {
    public static void main(String[] args) {
        String data [][] = {{"ABDUL","Kediri\t","085646668991"},
                            {"KUSNO","Trenggalek","085646668992"}
                            ,{"PONIRAN","Bojonegoro","085646668999"}};
        System.out.println("NAMA\tALAMAT\t\tTELEPON");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j]+"\t");
            }System.out.println();
        }
    }
}
