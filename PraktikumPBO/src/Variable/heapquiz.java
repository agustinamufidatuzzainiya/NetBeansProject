/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variable;

/**
 *
 * @author niya
 */
public class heapquiz {

   int id = 0;
    public static void main(String[] args) {
        int x = 0;
        heapquiz[] hq = new heapquiz[5];
        while (x<3) {
            hq[x] = new heapquiz();
            hq[x].id = x;
            x++;
        }
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];
        //do stuff
        
    }
    
}
