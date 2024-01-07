/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursi;

/**
 *
 * @author niya
 */
public class Arrays {
    private int arr[];
    private int nElement;

    public Arrays(int size) {
        arr = new int[size];
        nElement = 0;
    }

    public void insert(int value) {
        arr[nElement] = value;
        nElement++;
    }

    public void display() {
        for (int i = 0; i < nElement; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void mergeSort() {
        int[] workSpace = new int[nElement];
        recMergeSort(workSpace, 0, nElement - 1);
    }

    public void recMergeSort(int[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid + 1, upperBound);
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    public void merge(int[] workSpace, int lowIndex, int highIndex, int upperBound) {
        int j = 0;
        int lowerBound = lowIndex;
        int mid = highIndex - 1;
        int nItem = upperBound - lowerBound + 1;

        while (lowIndex <= mid && highIndex <= upperBound) {
            if (arr[lowIndex] < arr[highIndex]) {
                workSpace[j++] = arr[lowIndex++];
            } else {
                workSpace[j++] = arr[highIndex++];
            }
        }

        while (lowIndex <= mid) {
            workSpace[j++] = arr[lowIndex++];
        }
        while (highIndex <= upperBound) {
            workSpace[j++] = arr[highIndex++];
        }
        for (j = 0; j < nItem; j++) {
            arr[lowerBound + j] = workSpace[j];
        }
    }

    public static void main(String[] args) {
        Arrays array = new Arrays(10);
        array.insert(9);
        array.insert(7);
        array.insert(5);
        array.insert(8);
        array.insert(1);
        array.insert(3);
        array.insert(2);
        array.insert(10);
        array.insert(6);
        array.insert(4 );
        System.out.println("Data Sebelum di sorting : ");
        array.display();
        System.out.println("=========================");
        System.out.println("Data Sesudah di sorting :");
        array.mergeSort();
        array.display();
    }
}
