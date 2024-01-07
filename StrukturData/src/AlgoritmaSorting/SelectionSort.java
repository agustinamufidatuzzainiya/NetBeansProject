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
public class SelectionSort {
    public static void selectionSort(int[] dt) {
        for(int i=0; i<dt.length-1; i++){
            int m = i;
            
            for(int j=i; j<dt.length; j++){
                if(dt[j]<dt[m]){
                    m=j;
                }
            }
            
            int temp = 0;
            temp = dt[i];
            dt[i] = dt[m];
            dt[m] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] data = {15, 5, 60, 33, 20};
        selectionSort(data);
        
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
}
