package UTS;

public class nomor_2 {
    public static void main(String[] args) {
    int[] bilangan={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; //membuat variabel dengan array
        System.out.println("================== Nilai 1 - 20 ==================");
        System.out.println("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20");
        System.out.println(" ");
        System.out.println("================= Bilangan Genap =================");
        for(int i=0; i<bilangan.length; i++){       //mengambil data array dengan perulangan for
            if(bilangan[i]% 2 ==0){                 //jika data array bilangan habis dibagi 2 = 0
                System.out.print(bilangan[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("================= Bilangan ganjil ================");
        for(int i=0; i<bilangan.length; i++){
            if(bilangan[i] % 2!=0){           //jika data array bilangan tidak habis dibagi 2 = 0
                System.out.print(bilangan[i] +" ");   
            }
        }
        System.out.println("");
    }
}