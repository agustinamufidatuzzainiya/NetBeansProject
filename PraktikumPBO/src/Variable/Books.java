package Variable;
public class Books {

    String title;
    String author;
}

class BookTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
          
        myBooks[0].title = "Melawan kemustahilan";
        myBooks[1].title = "Muhammad Al Fatih 1453";
        myBooks[2].title = "awe-inspiring me";
        myBooks[0].author = "Dewa Eka Prayoga";
        myBooks[1].author = "Felix Siauw";
        myBooks[2].author = "Dewi Nur Aisyah";
        
        while (x < myBooks.length) {
            System.out.println(myBooks[x].title);
            System.out.print("Karya :");
            System.out.print(myBooks[x].author);
            x++;
        }  
    }
}
