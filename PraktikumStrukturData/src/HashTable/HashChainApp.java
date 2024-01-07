/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
//SeparateChaining
public class HashChainApp {
    public static void main(String[] args) {
        System.out.println("Agustina Mufidatuzzainiya_144");
        HashTable2 table = new HashTable2(15);

        table.insert(5);
        table.insert(31);
        table.insert(1);
        table.insert(15);
        table.insert(15);
        table.insert(0);
        table.insert(2);
        table.insert(16);
        table.insert(3);
        table.displayTable();
    }
}
