package InheritanceAndPolimorphysm;
public class Lion extends Feline {
    @Override
    public void jenis() {
        System.out.println("Singa namanya Eshan");
    }
    @Override
    public void makeNois() {
        System.out.println("Suaranya Raaaawwwrrr");
    }
    @Override
    protected void eat() {
        System.out.println("Makan Daging");
    }   
}
