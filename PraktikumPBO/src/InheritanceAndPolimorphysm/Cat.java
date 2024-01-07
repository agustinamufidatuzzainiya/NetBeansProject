package InheritanceAndPolimorphysm;
public class Cat extends Feline {
    @Override
    protected void jenis() {
        System.out.println("Kucing namanya Birrus");
    }
    @Override
    protected void makeNois() {
        System.out.println("Suaranya Meeoongggg");
    }
    @Override
    protected void eat() {
        System.out.println("Makanannya ikan dan whiskas");
    }
}
