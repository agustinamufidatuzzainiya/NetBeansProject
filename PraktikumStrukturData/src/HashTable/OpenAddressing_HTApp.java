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
public class OpenAddressing_HTApp {
    public static void main(String[] args) {
        System.out.println("Agustina Mufidatuzzainiya_144");
        OpenAddressing_HashTable table = new OpenAddressing_HashTable(15);
        
        table.insert(3);
        table.insert(8);
        table.insert(26);
        table.insert(4);
        table.insert(20);
        table.insert(25);
        table.insert(16);
        table.insert(28);
        table.insert(17);
        table.insert(6);
        table.displayTable();
        
        System.out.println("Agustina Mufidatuzzainiya_144");
        table.insert(11);
        table.insert(19);
        table.insert(15);
        table.insert(21);
        table.insert(30);
        table.displayTable();

        //System.out.println(table.find(15).getKey());
        //table.delete(15);
        System.out.println("Agustina Mufidatuzzainiya_144");
        table.displayTable();
    }
}
