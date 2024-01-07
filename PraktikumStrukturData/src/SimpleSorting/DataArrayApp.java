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
public class DataArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);
        arr.insert(16650210, "Ahmad", "Sidoarjo");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650200, "Jundi", "Malang");
        arr.insert(16650250, "Rais", "Ambon");
        arr.insert(16650280, "Arina", "Malang");
        arr.insert(16650260, "Helmi", "Madura");
        arr.insert(16650240, "Dinda", "Bandung");
        arr.insert(16650270, "Agung", "Madiun");
        arr.insert(16650220, "Ismail", "Banyuwangi");
        
        System.out.println("Before Sorting: ");
        arr.displayArray();
        
        System.out.println("\n1. Sorting By NIM (BubbleSort): ");
        arr.BubbleSort();
        arr.displayArray();
        
        System.out.println("\n2. Sorting By Name (SelectionSort): ");
        arr.SelectionSortByName();
        arr.displayArray();
    }
}
