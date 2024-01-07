package InheritanceAndPolimorphysm;
public class Hippo extends Animal {
    @Override
    protected void jenis() {
        System.out.println("Kudanil namanya Hippo");
    }
    @Override
    protected void makeNois() {
        System.out.println("Suaranya ngik ngik");
    }
    @Override
    protected void eat() {
        System.out.println("Makanannya rerumputan");
    }
}
