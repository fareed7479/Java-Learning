package ExceptionalHandlingDemo;

class Library{
    int availableBooks = 3;
    //Try Catch Block can be executed with multiple catch block's
    //Try and Finally can also be implemented , without using the Catch Block
    public void borrowBook(int booksReq){
        try{
            int[] books = { 101 , 102 , 103};
            System.out.println("Books Requested : "+books[booksReq]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occured , Book isn't available");
        } catch(NullPointerException e){
            System.out.println("Null Pointer Exception");
        } finally {
            System.out.println("Finally Block");
        }
    }

}



public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();
        library.borrowBook(5);
    }
}
