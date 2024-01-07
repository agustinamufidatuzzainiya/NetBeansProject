package Variable;
public class Buah {
    public static void main(String[] args) {
        String[] BuahFav = new String[4];
        //akses objek dog menggunakan referensi array
        BuahFav[0] = "Durian";
        BuahFav[1] = "Jeruk";
        BuahFav[2] = "Semangka";
        BuahFav[3] = "Jambu";
        
        for (String Buah : BuahFav) {
            //menampilkan nama buah-buahan pada array
            System.out.println(Buah);
        }
    }//main()
}
