package AlproTugas1;

import java.io.*;
class buffered {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        try {
            System.out.print("Nama  : ");
            String nama = br.readLine();
            System.out.print("NIM   : ");
            String nim = br.readLine();
            System.out.print("Arti dan Makna Nama: ");
            String makna = br.readLine();
            System.out.print("TTL   : ");
            String ttl = br.readLine();
            System.out.print("Motto Hidup   : ");
            String motto = br.readLine();
            
            System.out.println("===================");
            System.out.println("Nama                : "+nama);
            System.out.println("NIM                 : "+nim);
            System.out.println("Arti dan Makna Nama : "+makna);
            System.out.println("TTL                 : "+ttl);
            System.out.println("Motto Hidup         : "+motto);
        }
        catch(IOException eox)
        {
         System.out.println("Error");
    }
    }
}