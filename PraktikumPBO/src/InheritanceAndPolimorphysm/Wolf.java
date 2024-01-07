package InheritanceAndPolimorphysm;
public class Wolf extends Canine {
    @Override
    protected void jenis() {
        System.out.println("Serigala namanya swipper");
    }
    @Override
    protected void makeNois() {
        System.out.println("Suaranya aaauuuuummmmm");
    }
    @Override
    protected void eat() {
        System.out.println("Makanannya daging");
    }
}
