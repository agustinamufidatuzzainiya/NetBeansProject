package InheritanceAndPolimorphysm;
public class Canine extends Animal {
    @Override
    protected void eat() {
        this.eat();
    }
    @Override
    protected void roam() {
        System.out.println("Bertingkah laku seperti anjing");
    }
    @Override
    protected void makeNois() {
        this.makeNois();
    }
    @Override
    protected void jenis() {
        this.jenis();
    }
}
