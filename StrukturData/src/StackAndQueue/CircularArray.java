/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAndQueue;

/**
 *
 * @author niya
 */
public class CircularArray {
    private int maxsize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public CircularArray(int size) {
        this.maxsize = size;
        queArray = new String[maxsize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(String value) {
        if (isFull()) {
            System.out.println("Mohon Maaf nomor tempat duduk : " + value + ", tiket kereta jurusan Surabaya-Malang sudah terpilih");
            System.out.println("");
        } else {
            if (rear == maxsize - 1) {
                rear = -1;
            }
            queArray[++rear] = value;
            nItems++;
            System.out.println(value + " : Nomer tempat duduk telah terpilih");
        }
    }

    public String now() {
        String temp = queArray[front++];
        if (front == maxsize) {
            front = 0;
        }
        return temp;
    }

    public String remove() {
        String temp = queArray[front++];
        if (front == maxsize) {
            front = 0;
        }
        nItems--;
        System.out.println(temp + " : Nomer tempat duduk belum terpilih");
        return temp;
    }

    public void isiAntrian() {
        System.out.print("Silakan Pilih Nomer Tempat Duduk : ");
        if (!isEmpety() && size() < maxsize) {
            for (int i = 0; i < size(); i++) {
                System.out.print(now() + " | ");
            }
            int selisih = maxsize - size();
            for (int i = 0; i < selisih; i++) {
                System.out.print("Kosong | ");
            }
        } else if (isEmpety()) {
            System.out.println("Tempat duduk belum terpilih\n" + 0 + " Person");
        } else {
            for (int i = 0; i < size(); i++) {
                System.out.print(now() + " | ");
            }
        }
        System.out.println("");
    }

    public String peekFront() {
        return queArray[front];
    }

    public boolean isEmpety() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxsize);
    }

    public int size() {
        return nItems;
    }

    public void arrayDoubling() {
        int length = size();
        String newQue[] = new String[maxsize * 2];
        System.arraycopy(queArray, 0, newQue, 0, length);
        queArray = newQue;
        maxsize *= 2;
    }

    void isiPilihan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
