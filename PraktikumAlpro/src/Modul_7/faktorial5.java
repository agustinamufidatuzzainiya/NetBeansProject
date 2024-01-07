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
public class faktorial5 {
    public void test(int data){
        int nilai=1;
        if(data==0||data==1){
            nilai=1;
        }
        else{
            for(int i=1; i<=data; i++){
                nilai*=1;
            }
        }
        System.out.println(data+"! = "+nilai);
    }
    public static void main(String[] args) {
        faktorial5 f5=new faktorial5();
        f5.test(4);
        f5.test(5);
    }
}
