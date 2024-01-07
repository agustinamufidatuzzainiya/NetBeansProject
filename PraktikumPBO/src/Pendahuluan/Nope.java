/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendahuluan;

/**
 *
 * @author niya
 */
class nope {
    public static void main(String[] args) {
    int x = 0;
    int y = 0;
    while (x < 5) {
        
        if (y < 5) {
            x = x + 1;
            if (y < 3) {
                x = x - 1;
            }
        }
        y = y + 2;
        System.out.println(x + "" + y + " ");
        x = x + 1;
    }
   
}
}
    
    
    /*int x = 3;
    if (x > 2) {
        System.out.println("a");
    }
    if (x == 1) {
        System.out.println("d");
        x = x - 1;
    }
    if (x == 2) {
        System.out.println("b c");
    }
    while (x > 0) {
        x = x - 1;
        System.out.println("-");
        }
    }
}*/