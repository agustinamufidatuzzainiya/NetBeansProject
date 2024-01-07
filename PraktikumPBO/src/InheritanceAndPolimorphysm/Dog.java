package InheritanceAndPolimorphysm;
public class Dog extends Canine {
    @Override
    protected void jenis() {
        System.out.println("Anjing namanya Tom");
    }
    @Override
    protected void makeNois() {
        System.out.println("Suaranya gug guugg");
    }
    @Override
    protected void eat() {
        System.out.println("Makanannya daging dan tulang");
    }
}
