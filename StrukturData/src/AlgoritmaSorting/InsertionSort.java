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
public class InsertionSort {
    public static void Sort(int[] arr) {
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i - 1;
            
             while (j >= 0 && arr[j] > key){
                 arr[j + 1] = arr[j];
                 j = j - 1;
            }
             arr[j+1] = key;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {15, 5, 60, 33, 20};
        Sort(arr);
        
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
