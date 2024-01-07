/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author niya
 */

class HighArray { //Awal sebuah kelas bernama HighArray
    private int[] arr; //Deklarasi variable integer bertipe array bernama “arr” dengan akses private
    private int nElemen; //Deklarasi variable integer Bernama nElemen dengan akses private

    public HighArray(int max) { //pembuatan constructor class "HIghArray" yang 
                                //memiliki parameter type "max"dengan variabel "int"
        arr = new int[max]; //mendeklarasikan variabel "arr" sebagai array dengan memasukkan variabel type "int"
        nElemen = 0; //Variable nElemen diinisiasi
    }
    public void insert(int value) { //Deklarasi method insert untuk memasukkan nilai lewat parameternya 
                                    //value bertipe data integer
        arr[nElemen] = value; //nElemen menjadi index array arr dan value adalah variable dari nilai array
        nElemen++; //inisialisasi nElemen dengan nilai = 0
    }
    
    //mengurutkan Array
    public void sort(){
      int i, temp;
      for (i = nElemen -1; i > 0; i--) {
          for (int j = 0; j < i; j++) {
              if (arr[j] > arr[j + 1]) {
                  temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
              }
          }
      }
    }
    //mencari elemen Array dengan linier search
    public boolean find(int key) { //Deklarasi method pencari variable dengan parameter key
        int i; //Deklarasi variable i bertipe integer
        for (i = 0; i < nElemen; i++) { //Perulangan memakai for dengan awal 0 dan batasnya menggunakan nElemen
            if (arr[i] == key) { //Jika array arr berindex i nilainya sama dengan key maka perulangan berhenti 
                break; //berhenti atau break
            }
        }
        if (i == nElemen) { //melakukan pengkondisian nilai i
            return false; //jika i = nEelemen, maka nilai akan dikembalikan ke false
        } else {
            return true; //jika i tidak sama dengan nEelemen, maka nilai tidak akan dikembalikan dan akan ke true.
        }
    }
    //mencari elemen Array dengan binary search
    public boolean findBinarySearch(int key) {
        int a = 0;
        int b = nElemen - 1;
        while (a <= b) {
            int mid = (a + b)/2;
            if (arr[mid] == key) {
                a = mid + 1;
            } else {
                b = mid - 1;
            }
        }
        return false;
    }
    //menghapus indeks
    public boolean delete(int value) { //Deklarasi method Bernama delete dan berparamaeter tipe integer Bernama value
        int i; //Deklarasi variable i bertipe integer
        for (i = 0; i < nElemen; i++) {//Perulangan dengan awalan 0 dan batasan nElemen
            if (value == arr[i]) {//Jika nilai value sama dengan arr pada index ke i maka perulangan akan berhenti
                break; //berhenti
            }
        }
        if (i == nElemen) {//jika nilai i sama dengan nElemen, maka..
            return false; //nilai akan dikirim kembali ke false
        } else {//jika tidak, maka akan terjadi pengulangan kembali
            for (int j = i; j < nElemen; j++) {//dimana j = i, jika j < nElemen, maka i increment
                arr[j] = arr[j + 1];//lalu indeks Arr ke j akan diisi oleh indeks ke j+i
            }
            nElemen--;//setelah itu nElemen akan diimplementasikan
            return true;//dan nilai tersebut dikirim kembali ke true
        }
    }
    //mengetahui jumlah elemen
    public int size(){
        return nElemen;
    }
    //menampilkan Array
    public void display() {//method display dengan tipe void
        for (int i = 0; i < nElemen; i++) {//perulangan dimana jika i kurang dari nElemen
            System.out.print(arr[i] + " ");//maka output yang dicetak adalah indeks i dan di increment
        }
        System.out.println("");
    }
}
public class HighArrayApp {//Awal sebuah kelas Bernama HighArrayApp
    public static void main(String[] args) {//Sebuah main method
        int maxSize = 100;//Menginisialisasi variable integer maxSize bernilai 100
        HighArray arr;//Memanggil arr dari kelas HighArray
        arr = new HighArray(maxSize);//Panjang index arr menjadi maxSize yaitu 100
        
        arr.insert(70);//memasukkan index ke 0
        arr.insert(80);//memasukkan index ke 1
        arr.insert(75);//memasukkan index ke 2
        arr.insert(55);//memasukkan index ke 3
        arr.insert(85);//memasukkan index ke 4
        arr.insert(25);//memasukkan index ke 5
        arr.insert(30);//memasukkan index ke 6
        arr.insert(00);//memasukkan index ke 7
        arr.insert(90);//memasukkan index ke 8
        arr.insert(40);//memasukkan index ke 9
        
        arr.display();//memanggil method display pada class HighArray melalui object
        arr.size();
        arr.sort();
        arr.display();
       
        int key = 25;//inisialisasi variable key dengan tipe data int yang mempunyai nilai 25
        if (arr.find(key)) { //jika method find yang dipanggil memberikan nilai
            System.out.println(key + " ditemukan");//jika nilai ditamukan, maka akan muncul "ditemukan"
        } else {
            System.out.println(key + " tidak ditemukan");//jika nilai tidak ditemukan, maka yang akan muncul ialah
                                                         //"tidak ditemukan"
        }
        key = 40;
        if (arr.findBinarySearch(key)) {
            System.out.println(key + " ditemukan");
        } else {
            System.out.println(key + " tidak ditemukan");
        }
        
        arr.delete(00);//perintah untuk menghapus array 00
        arr.delete(80);//perintah untuk menghapus array 80
        arr.delete(55);//perintah untuk menghapus array 55
        arr.display();//Method display akan menampilkan semua value dari array arr yang tersisa setelah program diatas
    
        System.out.println("Jumlah Elemen: " + arr.size());
    }
}