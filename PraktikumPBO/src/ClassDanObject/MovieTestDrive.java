package ClassDanObject;
public class MovieTestDrive {

    public static void main(String[] args) {
        movie satu = new movie();
        satu.title = "ayat-ayat cinta";
        satu.genre = "islami";
        satu.rating = 4;
        
        movie dua = new movie();
        dua.title = "the davinci code";
        dua.genre = "misteri";
        dua.rating = 4;
        dua.playIt();
        
        movie tiga = new movie();
        tiga.title = "sang pencerah";
        tiga.genre = "islami";
        tiga.rating = 5;
    } 
}
