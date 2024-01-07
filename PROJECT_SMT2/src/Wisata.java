
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Putri Oktavia
 */
public class Wisata {

    private Data[] hashArray;
    private int size = 15;
    private static int nItem = 0;

//    Hash Table
    public Wisata() {
        hashArray = new Data[size];
        insert("Jatim Park 1", "1. Kolam Renang \n2. Histeria \n3. Coaster \n4. Sky Ride \n5. Superman \n6. Pendulum 360 \n7. Waterboom \n8. Galeri Etnik \n9. Volcano Coaster \n10. Rumah Hantu");
        insert("Jatim Park 2", "1. Zona Aquarium \n2.Nocturnal House \n3. Savannah \n4. Baby Zoo \n5. Safari Farm \n6. Water Park \n7. Fantasy Happy Land");
        insert("Jatim Park 3", "1. Dino Park \n2. The Legend Stars \n3. Fun Tech Plaza \n4. Museum Musik Dunia \n5. Milenial Glow Garden \n6. Circus Magic \n7. Keliling Dunia");
        insert("Kampung Warna Warni", "1. Tempat Parkir \n2. Warung \n3. Musholla \n4. Toilet \n5. Spot Foto Instagenic \n5. Galeri seni dan lukisan unik");
        insert("Kampung Tridi", "1. Tempat Parkir \n2. Warung \n3. Musholla \n4. Toilet \n5. Spot Foto Instagenic \n5. Lukisan 3D");
        insert("Museum Angkut", "1. Free Shuttle Car \n2. Food Court \n3. Mushola \n4. Penyewaan Kursi Roda \n5. ATM Center \n6. Deposit Counter atau Penitipan Barang");
        insert("Alun-Alun Malang", "1. Papan nama  \n2. Air Mancur Menari  \n3. Bangku Duduk \n4. Burung Merpati \n5. Tempat Bermain Anak-anak \n6. Area Skateboard \n7. Area Pertunjukan \n8. Gazebo");
        insert("Alun-Alun Batu", "1. Bianglala \n2. Arena Bermain Anak-Anak \n3. Air Mancur \n4. Kelinci Hias Dan Mobil Hias \n5. Pasar Laron");
        insert("Pantai Balekambang", "1. Penginapan \n2. Flying Fox \n3. Pure \n5. Musholla \n6. Area Perkemahan");
        insert("Pantai Tiga Warna", "1. Tempat Penyewaan Alat Snorkeling \n2. Musholla \n3. Warung Makan \n4. Spot Foto");
        insert("Pantai Teluk Asmara", "1. Flying Fox \n2. Gardu Pandang \n3. Musholla \n4. Warung Makan \n5. Tenda-tenda");
        insert("Pantai Ngliyep", "1. Area Parkir \n2. Musholla \n3. Toilet \n4. Warung Makan \n5. Gazebo \n6. Pendopo \n7. Penginapan");
    }

    public int hashFunc(String key) {
        int index = 0;
        for (int i = 0; i < key.length(); i++) { // perulangan 
            index += key.charAt(i); // charAt > membaca tipe karakter string
        }
        index %= size;
        return index;
    }

    public void insert(String key, String data) {
        if (key == null && data == null) {
            JOptionPane.showMessageDialog(null, "Kata harus diisi!");
            return;
        }

        Data item = new Data(key, data); // Inisialisasi item
        String id = item.getKey(); // pemanggilan key pada item

        int hashVal = hashFunc(id); // deklarasi hashval 
        while (hashArray[hashVal] != null) { // perulangan jika hasharray tidak bernilai null
            hashVal++;
            hashVal %= size;
        }
        hashArray[hashVal] = item;
        nItem++;

    }

    public Data find(String key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey().equalsIgnoreCase(key)) {
                return hashArray[hashVal];
            }
            hashVal++;
            hashVal %= size;
        }
        return null;
    }

}


