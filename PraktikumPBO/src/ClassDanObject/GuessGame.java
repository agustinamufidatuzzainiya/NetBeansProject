package ClassDanObject;
public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    public void startGame() {

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Aku Mikirin Angka Antara 0-9...");

        while (true) {
            System.out.println("Angka Yang Harus Ditebak Adalah" + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("Pemain Pertama Menebak Angka" + guessP1);

            guessP2 = p2.number;
            System.out.println("Pemain Pertama Menebak Angka" + guessP3);

            guessP3 = p3.number;
            System.out.println("Pemain Pertama Menebak Angka" + guessP3);

            if (guessP1 == targetNumber) {
                p1isRight = true;
            }
            if (guessP2 == targetNumber) {
                p2isRight = true;
            }
            if (guessP1 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("Mantappp Sudah Ada Yang Menang ???");
                System.out.println("Apa Pemain 1 Yang Menang ???" + p1isRight);
                System.out.println("Apa Pemain 3 Yang Menang ???" + p2isRight);
                System.out.println("Apa Pemain 3 Yang Menang ???" + p3isRight);
                System.out.println("Permainan Selesai !!!");
                break;
            } else {
                System.out.println("Hayo... Coba Tebak Lagi !!!");
            }
        }
    }
}
