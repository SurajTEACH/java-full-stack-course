package opps_practics.classobjectconstructorethisusse;


class Book {
   String title;
   String auther;

   Book(String tile, String auther){
       this.title = tile;
       this.auther = auther;
   }

   void displayBook(){
       System.out.println("Show result"+ "\ntitle:"+title+"\nauther:"+auther);
   }
}

public class BookInfo {
    public static void main(String[] args) {
       
        Book b1 = new Book("The Alchemist","Paulo Coelho");
        b1.displayBook();
        b1 = new Book("The Great Gatsby","F. Scott Fitzgerald");
        b1.displayBook();
        b1 = new Book("To Kill a Mockingbird","Harper Lee");
        b1.displayBook();
    }
}
