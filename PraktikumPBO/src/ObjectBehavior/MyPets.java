package ObjectBehavior;
public class MyPets {
    public String nama;
     private int power;
    
    public int getPower(){
        return power;
    }
    public void setPower(int a) {
        power = a;
    }
    void bark() {
        if (power > 50) {
            System.out.println();
        } else if (power > 30) {
            System.out.println();
        } else {
            System.out.println();
        }
    }
class pet{
    public void cetak(){
        System.out.println(power);
    }
}
    public static void main(String[] args) {
        new MyPets();
        MyPets[] animals = new MyPets[5];
        int x = 0;
            animals[0] = new MyPets();
            animals[1] = new MyPets();
            animals[2] = new MyPets();
            animals[3] = new MyPets();
            animals[4] = new MyPets();
            animals[0].nama = "Sheep";
            animals[1].nama = "Cat";
            animals[2].nama = "Bird";
            animals[3].nama = "Moo Cow";
            animals[4].nama = "Chicken";
            animals[0].power =  ((int) (Math.random()*100)); 
            animals[1].power =  ((int) (Math.random()*100)); 
            animals[2].power =  ((int) (Math.random()*100)); 
            animals[3].power =  ((int) (Math.random()*100)); 
            animals[4].power =  ((int) (Math.random()*100)); 
            
            
        while (x < animals.length){
           if  (animals[x].power > 50 ){
               System.out.println(animals[x].nama);
               System.out.println("Papan atas ");
               System.out.println("Peringkat 1");
           }else if (animals[x].power > 30 ){
               System.out.println(animals[x].nama);
               System.out.println("Papan atas");
               System.out.println("peringkat 5 besar");
           }else{
               System.out.println(animals[x].nama);
               System.out.println("papan bawah");
               System.out.println("peringkat 10 besar");
           }
        x++;
           }
        animals[0].bark();
        animals[1].bark();
        animals[2].bark();
        animals[3].bark();
        animals[4].bark();
    }
}