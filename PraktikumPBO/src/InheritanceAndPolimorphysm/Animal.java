package InheritanceAndPolimorphysm;
public class Animal {
    
    void jenis() {
        System.out.println();
    }
    void makeNois() {
        System.out.println();
    }
    void roam() {
        System.out.println("mamalia yang hidup di perairan");
    }
    void eat() {
        System.out.println();
    }
    void sleep() {
        System.out.println("menutup mata ketika tidur");
    }
    void umur() {
        System.out.println();
    }
}

class testDrive {
    public static void main(String[] args) {
        Animal[] hewan = {
            new Lion(),
            new Cat(),
            new Tiger(),
            new Hippo(),
            new Dog(),
            new Wolf(),
        };
        for (int i = 0; i < hewan.length; i++) {
            hewan[i].jenis();
            hewan[i].makeNois();
            hewan[i].roam();
            hewan[i].eat();
            hewan[i].sleep();
            hewan[i].umur();
            System.out.println(" ");
        }
    }
}