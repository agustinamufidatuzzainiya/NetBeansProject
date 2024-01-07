/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import static java.util.Objects.hash;
import javafx.scene.chart.PieChart;
import javax.swing.JOptionPane;
/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
public class methode {
    //menampung data masyarakatnya dg tipe array
    public masyarakat[] hashArray;
    public int size;
    public int index = 0;
    public int cari = 0;
    
    //konstruktor untuk mencari data dengan parameter data
    public methode(int sizeVal) {
        this.size = sizeVal;
        hashArray = new masyarakat[size];
    }
    
    //method untuk mencari data dengan parameter data
    public int binarySearch(String data) {
        cari++;
        int low = 0;
        int high = hashArray.length;
        int mid;
        
        while (low <= high) {
            mid = (low + high)/2;
            String noRumah = String.valueOf(hashArray[mid].getNoRumah());
            
            if (noRumah.compareTo(data) < 0) {
                low = mid + 1;
            } else if (noRumah.compareTo (data) > 0) {
                 high = mid - 1;
            }else {
                return mid;
            }
            
        }
        return -1;
    }
    
    //method yang digunakan untuk mengurutkan data berdasarkan nomor rumah
    public void BubbleSortNoRumah() {
        int batas, i;

        for (batas = size-1; batas > 0 ; batas--) { 
            for (i = 0; i < batas; i++) { 
                if (hashArray[i].getNoRumah()> hashArray[i + 1].getNoRumah()) {// membandingkan data awal dengan data setelahnya
                    swap(i, i + 1);// menukar data 
                }
            }
        }
    }
    
    //method yang digunakan untuk mengurutkan data berdasarkan nomor KK
    public void BubbleSortNoKK() {
        int batas, i;

        for (batas = size-1; batas > 0 ; batas--) {
            for (i = 0; i < batas; i++) {
                if (hashArray[i].getNoKK()> hashArray[i + 1].getNoKK()) {// membandingkan data awal dengan data setelahnya
                    swap(i, i + 1);// menukar data 
                }
            }
        }
    }
    
    // method untuk mengurutkan data berdasarkan jml anggota
    public void BubbleSortJmlAnggota() { 
        int batas, i;

        for (batas = size-1; batas > 0 ; batas--) {
            for (i = 0; i < batas; i++) {
                if (hashArray[i].getJumlah()> hashArray[i + 1].getJumlah()) {// membandingkan data awal dengan data setelahnya
                    swap(i, i + 1);// menukar data
                }
            }
        }
    }
    
    //method untuk menentukan nilai pivot
    private int partitionNama(int left, int right, String pivot) {
        int leftPtr = left - 1;
        int rightPtr = right + 1;
        while(true) {
            while (leftPtr < right && hashArray[++leftPtr].getNama().compareTo(pivot) < 0);
            while (rightPtr > left && hashArray[++rightPtr].getNama().compareTo(pivot) > 0);
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }
        return leftPtr;
    }
    
    // method untuk mengurutkan subarray secara rekursif
    private void recQuickSortNama(int left, int right) {
        if (right - left <= 0) 
            return;
        else {
            String pivot = hashArray[right].getNama();
            int partisi = partitionNama(left, right, pivot);
            recQuickSortNama(left, partisi - 1); // panggil method partisi untuk mengurutkan bagian kiri
            recQuickSortNama(partisi, right); // panggil method partisi untuk mengurutkan bagian kanan
        }
    }
    
    //mengurutkan nama dg memanggil requicksrtnama
    public void quickSortNama() {
        recQuickSortNama(0, size - 1);
    }
    
    // method dgn parameter key untuk menentukan index
    public int hashFunc(int key) {
        return key % size;
    }
    
//    public masyarakat find(int key) {
//        int hashVal = hashFunc(key);
//        while (hashArray[hashVal] != null) {
//            if (hash.Array[hashVal].getKey() == key) {
//                return hashArray[hashVal];
//            }
//            ++hashVal;
//            hashVal %= size;
//        }
//        return null;
//    }
    //method untuk menginputkan data
    void insert(String nama, int noRumah, int noKK, String noHp, int jumlah, int urut) {
        masyarakat item = new masyarakat(nama, noRumah, noKK, noHp, jumlah);
        int key = item.getKey();
        int hashVal = hashFunc(key);
        
        while (hashArray[hashVal] != null ) {

            ++hashVal;
            hashVal %= size;

        }
        hashArray[hashVal] = item;
    }
    
    //menukar posisi data
    private void swap(int left, int right) {
        masyarakat temp = hashArray[left];
        hashArray[left] = hashArray[right];
        hashArray[right] = temp;
    }
    
    //method untuk menghapus semua data array
    public void DeleteAll() {
        int jawab = JOptionPane.showOptionDialog(null, "Apakah anda yakin untuk menghapus data?", 
            "Terhapus", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        if (jawab == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Data Berhasil Terhapus");
            
            for(int i=0;i<size;i++){ // mengambil banyak data dan di tampung pada var i
                hashArray[i] = null;  // menghapus semua data array dari method
            }
        }
    }
}
