package UAS;
public class while2 {
    public static void main(String[] args) {
        int tahun;
        tahun=1600;
        while (tahun<=2078) {
            if((tahun%100==0)&&(tahun%400==0))
                System.out.println("tahun "+tahun+" = kabisat 1");
            else if((tahun%100!=0)&&(tahun%4==0))
                System.out.println("tahun "+tahun+" = kabisat 2");
            else
                System.out.println("tahun "+tahun+" = NOT kabisat");
            tahun++;
        }
    }
}