/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleSorting;

/**
 *
 * @author niya
 */
public class BubbleSortApp_210605110144 {
    public static void main(String[] args) {
        BubbleSorting_210605110144 arr;
        arr = new BubbleSorting_210605110144 ();
        arr.arr[0]= 19;
        arr.arr[1]= 15;
        arr.arr[2]= 23;
        arr.arr[3]= 25;
        arr.arr[4]= 34;
        arr.arr[5]= 10;
        
        System.out.print("Sebelum disorting : ");
        arr.display1();
        
        System.out.print("Setelah disorting : ");
        arr.InsertionSort();
        arr.display1();
    }
}
