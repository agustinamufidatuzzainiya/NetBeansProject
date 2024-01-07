/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleSorting;

/**
 *
 * @author Agustina Mufidatuzzainiya
 */
public class DataArray {
    private Mahasiswa[] mhs;
    private int nElemen;

    public DataArray(int max){
        mhs = new Mahasiswa[max];
        nElemen = 0;
    }
    
    public Mahasiswa find(long searchNim) {
        int i;
        for (i = 0; i < nElemen; i++) {
             if (mhs[i].getNim()== searchNim) {
             break;
        }
    }
        if (i == nElemen) {
            return null;
        } else {
            return mhs[i];
        }
    }
    
    public void insert(long nim, String nama, String asal) {
        mhs[nElemen] = new Mahasiswa(nim, nama, asal);
        nElemen++;
    }
    
    public void swap(int one, int two) {
        Mahasiswa temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }
    
    public void BubbleSort(){
        int i, batas;
        for (batas = nElemen-1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if(mhs[i].getNim()>mhs[i+1].getNim()){
                swap(i,i+1);
            }
        }
    }
}
    public void InsertionSort(){
        int i, curIn;
        for (curIn = 1; curIn < nElemen; curIn++) {
            Mahasiswa temp = mhs[curIn];
            i = curIn;
            while (i > 0 && mhs[i-1].getNim()>= temp.getNim()) {                
                mhs[i]=mhs[i-1];   
            i--;
            }mhs[i]=temp;
        }
    }
    public void SelectionSortByName() {
        int awal, i, min;
            for (awal=0; awal< nElemen-1; awal++) {
            min = awal;
                for (i = awal + 1; i < nElemen; i++) {
                    if (mhs[i].getName().compareToIgnoreCase
                    (mhs[min].getName())<0) {
                    min = i;
                    }
                }
            swap(awal, min);
            }
    }  
    
    public void InsertionSortByName() {
        int i;
        for (i = 1; i < nElemen; i++) {
            for (int j = i; j > 0; j--) {
                if (mhs[j].getName().compareToIgnoreCase
                (mhs[j - 1].getName()) < 0) {
                    swap(j, j - 1);
                }
            }
        }
    }
    public void displayArray(){
        for (int i = 0; i< nElemen; i++){
            mhs[i].displayMhs();
        }
    }
}