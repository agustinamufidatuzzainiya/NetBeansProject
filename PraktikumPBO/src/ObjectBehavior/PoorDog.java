package ObjectBehavior;
public class PoorDog {
    private int size;
    private String name;
    
    public int getSize() {
        return size;
    }
    public String getName(){
        return name;
    }
}
class PoorDogTestDrive {
    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.println("Ukuran Anjing = " + one.getSize());
        System.out.println("Nama Anjing = " + one.getName());
    } 
}
