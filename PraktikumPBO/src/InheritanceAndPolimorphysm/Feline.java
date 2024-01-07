package InheritanceAndPolimorphysm;
public class Feline extends Animal {
    @Override
    protected void umur() {
        System.out.println("Berumur kurang lebih sampai 15 tahun");
    }
    @Override
   protected void eat() {
        System.out.println("Bertingkah laku seperti kucing");
    }
    @Override
    protected void roam() {
        super.roam();
    }
    @Override
    protected void makeNois() {
        super.makeNois();
    }
    @Override
    protected void jenis() {
        this.jenis();
    }
}
