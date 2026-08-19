package CustomeExceptionsDemo;
//These can be used to place in different files
//The Custom Exceptions have to be extended with Class Exception.
//And it has to be inherited using the super Keyword for that Exception class.
class BookUnavailableException extends Exception{
    public BookUnavailableException(String message) {
        super(message);
    }
}

class MemberShipExpireException extends Exception {
    public MemberShipExpireException(String message) {
        super(message);
    }
}

class Library{
    int availableBooks = 3;
    public void borrowBook(int booksReqCount , boolean membership) throws Exception {
        if(booksReqCount > availableBooks)
            throw new BookUnavailableException("Not Enough Books available");
        if(booksReqCount < 0)
            throw new Exception("Atleast One Books Have to be Requested");
        if(membership)
            throw new MemberShipExpireException("Membership has been Expired");
    }
}




public class customException {
    public static void main(String[] args) {
        Library library = new Library();
        try {
            //library.borrowBook(10 , false);
            library.borrowBook(2 , false);
            library.borrowBook(2 , true);
        } catch (Exception e){
            //It Prints the Exception we defined
            //Stack Trace is used to identify the errors in defined way in console.
            e.printStackTrace();
            System.out.println("Exception Occureed : "+ e.getMessage());
        }
    }
}


