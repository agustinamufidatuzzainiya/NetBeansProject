/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmaSorting;

/**
 *
 * @author niya
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = 0;
                    
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {15, 5, 60, 33, 20};
        bubbleSort(arr);
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}