/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAndQueue;

import java.util.Scanner;

/**
 *
 * @author niya
 */
public class stack {

    protected int maxsize;
    private String[] stackArray;
    private int top;
    private int length;

    public stack(int size) {
        maxsize = size;
        stackArray = new String[maxsize];
        top = -1;
    }

    public void push(String item) {
        stackArray[++top] = item;
        length++;
    }

    public String pop() {
        return stackArray[top--];
    }

    public String pick() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxsize - 1);
    }

    public int getLength() {
        return length;
    }

    public void arrayDoubling() {
        int length1 = getLength();
        String newStack[] = new String[maxsize * 2];
        System.arraycopy(stackArray, 0, newStack, 0, length1);
        stackArray = newStack;
        maxsize *= 2;
    }
}

class pembalik {

    stack st = new stack(5);

    public void setAngka(String angka) {
        for (int i = 0; i < angka.length(); i++) {
            st.push(String.valueOf(angka.charAt(i)));
        }
    }

    public String getAngka() {
        String temp = "";
        for (int i = 0; i < st.getLength(); i++) {
            temp += st.pop() + "";
        }
        return temp;
    }
}

class AppPembalik {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        pembalik pm = new pembalik();
        String angka;

        System.out.println("Sebelum array doubling");
        System.out.println("========================");
        System.out.print("Masukkan angka : ");
        angka = sc.nextLine();

        if (angka.length() > pm.st.maxsize) {
            System.out.println("too long");
        } else {
            pm.setAngka(angka);
            System.out.println();
            System.out.print("angka yang dibalik : " + pm.getAngka() + "\n");
        }

        System.out.println("\nSetelah array doubling");
        System.out.println("========================");
        System.out.print("Masukkan angka : ");
        angka = sc.nextLine();

        if (angka.length() > pm.st.maxsize) {
            pm.st.arrayDoubling();
            pm.setAngka(angka);
            System.out.print("angka yang dibalik : " + pm.getAngka() + "\n");
        }
    }
}
