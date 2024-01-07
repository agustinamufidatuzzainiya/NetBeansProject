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
public class faktorial {
    public static void main(String[] args) {
        int nilai=1;
        int data=4;
        if(data==0||data==1){
            nilai=1;
        }
        else{
            for(int i=1; i<=data; i++){
                nilai*=i;
            }
        }
        System.out.println(data+"! = "+nilai);
    }
}
