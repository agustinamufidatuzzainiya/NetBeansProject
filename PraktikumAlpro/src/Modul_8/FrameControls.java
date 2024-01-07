/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_8;
import java.awt.*;
/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
public class FrameControls extends Frame{
     public static void main(String[] args) {
        FrameControls fwc = new FrameControls();
        fwc.setLayout(new FlowLayout());
        fwc.setSize(600, 600);
        fwc.add(new Button("Test Me!"));
        fwc.add(new Label("Label"));
        fwc.add(new TextField());
        CheckboxGroup cbg = new CheckboxGroup();
        fwc.add(new Checkbox("chk1", cbg, true));
        fwc.add(new Checkbox("chk2", cbg, true));
        fwc.add(new Checkbox("chk3", cbg, true));
        fwc.setVisible(true);
    }
}
