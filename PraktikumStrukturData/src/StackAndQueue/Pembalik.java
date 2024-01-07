/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAndQueue;

/**
 *
 * @author niya
 */
public class Pembalik {
    private Stack theStack;
    private String terbalik = "";

    Pembalik(String inputKarakter) {
        theStack = new Stack(100);
        // Push String input ke char
        for (int i = 0; i < inputKarakter.length(); i++) {
            theStack.push(inputKarakter.charAt(i));
        }
        // pop taruk di var balik
        while (!theStack.isEmpty()) {
            terbalik += theStack.pop();
        }
    }

    public String getTerbalik() {
        return terbalik;
    }

    public void setTerbalik(String terbalik) {
        this.terbalik = terbalik;
    }

}
