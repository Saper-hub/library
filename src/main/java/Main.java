import model.Book;
import model.Library;
import model.LibraryException;

import java.util.Scanner;

public class Main {

    private static Scanner SCANNER;
    public static void main(String[] args) {

        Library library = createLibraryWithBooks();

        SCANNER = new Scanner(System.in);

        interfejs();

        int liczba;

        do {
            liczba = SCANNER.nextInt();
            switch (liczba) {
                case 1:
                    library.printAllBooks();
                    //System.out.println("Wyświetl wszystkie książki - jeszcze nie zaimplementowane");
                    break;
                case 2:
//                    System.out.println("Dodaj książkę - jeszcze nie zaimplementowane");
                    System.out.println("podaj autora: ");
                    String author = SCANNER.next();
                    SCANNER.nextLine();
                    System.out.println("podaj tytuł: ");
                    String title = SCANNER.nextLine();
                    System.out.println("podaj isbn: ");
                    String isbn = SCANNER.nextLine();

//                    nie dodaje do biblioteki :(

                    break;
                case 3:
                    //System.out.println("Usuń książkę - jeszcze nie zaimplementowane");
                    System.out.println("Podaj książkę, którą chcesz usunąć: ");
                    Long id = SCANNER.nextLong();

                    try{
                        library.deleteBookById(id);
                        System.out.println("udało się usunąć");
                    }
                    catch(LibraryException libraryException){
                        System.out.println(libraryException.getMessage());
                }
                    break;
                default:
                    System.out.println("Błąd");
                    break;
            }
        } while (true);
    }

    public static void interfejs() {

        System.out.println("Witaj w bibliotece! Co mogę dla Ciebie zrobić?");
        System.out.println("1) Wyświetl wszystkie książki");
        System.out.println("2) Dodaj książkę");
        System.out.println("3) Usuń książkę");
        System.out.print("Wybieram: ");

    }

    private static Library createLibraryWithBooks() {
        return new Library(new Book[]{
                new Book("Juliusz Słowacki", "Balladyna", "9788373272170"),
                new Book("Jan Brzechwa", "Akademia pana Kleska", "9788371530326"),
                new Book("Arkady Fiedler", "Dywizjon 303", "9788381271738"),
                new Book("Henryk Sienkiewicz", "Latarnik", "9788387139803"),
                new Book("Juliusz Słowacki", "Kordian", "9788389524027")
        });
    }

}
