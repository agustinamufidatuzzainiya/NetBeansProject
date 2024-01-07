/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDanObject;

/**
 *
 * @author niya
 */
public class Player {

    int number = 0;

    public void guess() {

        number = (int) (Math.random() * 10);
        System.out.println("Saya Menebak Angka" + number);
    }
}
