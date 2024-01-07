package UAS;
public class do_while1 {
    public static void main(String[] args) {
        int tahun;
        tahun = 2356;

        System.out.println("======= Do While - 1 =======");
        do {
            if(tahun % 400 == 0){
                System.out.println("Tahun " + tahun + " = Kabisat 1");
            }else if ((tahun % 400 != 0) &&(tahun % 100 == 0)){
                System.out.println("Tahun " + tahun + " = Bukan Kabisat 1");
            }else if ((tahun % 400 != 0) &&(tahun % 100!= 0) &&(tahun % 4 == 0)){
                System.out.println("Tahun " + tahun + " = Kabisat 2");
            }else{
                System.out.println("Tahun " + tahun + " = Bukan Kabisat 2");
            }
            tahun++;
        }while (tahun <= 2359);
    }
}