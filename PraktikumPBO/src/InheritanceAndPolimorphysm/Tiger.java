package InheritanceAndPolimorphysm;
public class Tiger extends Feline {
    @Override
    protected void jenis() {
        System.out.println("Harimau namanya Selen");
    }
    @Override
    protected void makeNois() {
        System.out.println("Suaranya raawr");
    }
    @Override
    protected void eat() {
        System.out.println("Makanannya daging");
    }
}
