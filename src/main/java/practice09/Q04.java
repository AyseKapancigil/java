package practice09;

public class Q04 {
    /*
    Type code to add books to library with its information, then create a method to show information of book.
     */

    String bookName;
    String authorName;
    int numOfPage;
     static int numOfBooks;

     String bookID;

    public static void main(String[] args) {

        Q04 book1 = new Q04("Crime and Punisment","Dostoevsky",650);
        book1.displayBook();
        Q04 book2 = new Q04("Thousand shiny sun","Khaled huseyni",276);
        book2.displayBook();




    }

    Q04(String bookName, String authorName, int numOfPage){

       this. bookName = bookName;
       this.authorName = authorName;
       this.numOfPage = numOfPage;
       numOfBooks++;
       bookID= bookName.substring(0,2)+numOfBooks;

}
 public void displayBook (){

    System.out.println(bookName+authorName+numOfPage+numOfBooks+bookID);

}
}
