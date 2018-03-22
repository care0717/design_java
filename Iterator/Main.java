

public class Main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Around"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinde"));
        bookShelf.appendBook(new Book("Dadby"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}