package model;

public class Library {
    private Book[] books;

    public Library (Book[] books){
        this.books = books;
    }

    public void printAllBooks(){

        for (Book book: books) {
            System.out.println(book.toString());
        }
    }

    public void deleteBookById(Long id) throws LibraryException {
//        zrobić nową, mniejszą tablicę
//        nowa tablica nie powinna zawierać elementu usuniętego

        if(isBookPresent(id)) {
            Book[] newBooksTable = new Book[books.length - 1];
            int offset = 0;

            for (int i = 0; i < books.length; i++) {
                if (!id.equals(books[i].getId())) {
                    newBooksTable[i - offset] = books[i];
                } else {
                    offset++;
                }
            }
            books = newBooksTable;
        }
        else{
            throw  new LibraryException("Podana książka nie widnieje w bibliotece");
        }
    }

    private boolean isBookPresent(Long id){

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void addBook(Book book){


    }

//    public void deleteBookById(Long id) { Book[] newBooksTable = new Book[books.length - 1]; int offset = 0; for (int i = 0; i < books.length; i++) { if (!id.equals(books[i].getId())) { newBooksTable[i - offset] = books[i]; } else { offset++; } } books = newBooksTable; }
//    System.out.println("Podaj autora ksiazki: "); s.nextLine(); String author = s.nextLine(); System.out.println("Podaj tytul ksiazki: "); String title = s.nextLine(); s.nextLine(); System.out.println("Podaj isbn ksiazki: "); String isbn = s.nextLine();

}
