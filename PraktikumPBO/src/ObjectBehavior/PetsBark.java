package ObjectBehavior;
import ObjectBehavior.GoodDog;
public class PetsBark {
    public static void main(String[] args) {
      GoodDog[] pet = new GoodDog[10];
      for (int i = 0; i < pet.length; i++){
          pet[i] = new GoodDog();
          int random = (int) (Math.random()*100);
          
          pet[i].setSize(random);
          System.out.println("Peliharaan " + (i+1) + " bersuara");
          
          pet[i].bark();
          System.out.println("");
      }
    }
}