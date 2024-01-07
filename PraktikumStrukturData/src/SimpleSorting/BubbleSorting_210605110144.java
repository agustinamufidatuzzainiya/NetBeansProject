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
public class BubbleSorting_210605110144 {
    int nElemen = 6;
    int[] arr = new int[nElemen];

/*   public void BubbleSort() {
        int batas, i;
        for (batas = nElemen - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (arr[i] < arr[i + 1]) {
                    //if (arr[i] < arr[i + 1])
                    //mengganti jadi kurang dari agar metodenya jadi descending 
                    swap(i, i + 1);
                    display(); //untuk menampilkan berapa kali pengurutan data array terjadi
                }
            }
        }
    }

    public void SelectionSort() { int awal, i, min;
        for (awal=0; awal< nElemen-1; awal++) { min = awal;
            for (i = awal + 1; i < nElemen; i++) { if (arr[i] < arr[min]) {
            min = i;
        }
    }
        swap(awal, min);
    }
}*/
    public void InsertionSort() { int i, curIn;
        for (curIn= 1; curIn < nElemen; curIn++) { int temp = arr[curIn];
            i = curIn;
            while (i > 0 && arr[i - 1] >= temp) { arr[i] = arr[i - 1];
            i--;
        }
            arr[i] = temp;
        }
    }

    public void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
    
    public void display1() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    
    public void display() {
        InsertionSort();
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}