/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_8;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
public class CheckBox extends JFrame{
    Checkbox unta = new Checkbox("nama kamu siapa");
    Checkbox kuda = new Checkbox("nama kamu Anton");
    Checkbox sapi = new Checkbox("nama kamu Baim");
    CheckboxGroup checkboxGroup = new CheckboxGroup();
    CheckBox(){
        super("PROGRAM MENGHITUNG ZAKAT");
        setLocation(200, 100);
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek(){
        getContentPane().setLayout(null);
        getContentPane().add(unta);
        getContentPane().add(kuda);
        getContentPane().add(sapi);
        unta.setBounds(30, 90, 150, 20);
        kuda.setBounds(30, 120, 150, 20);
        sapi.setBounds(30, 150, 150, 20);
        setVisible(true);
    }
    public static void main(String[] args) {
        CheckBox zz = new CheckBox();
        zz.objek();
    }
}
