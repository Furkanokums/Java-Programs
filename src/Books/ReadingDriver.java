package Projects.Project2_Books;// Furkan Okumuş
// 220201070

public class ReadingDriver {
    public static void main(String[] args) {

        Book book = new Book(
                "The Great Gatsby",
                180,
                "Scribner",
                1925,
                "English",
                "001",
                "F. Scott Fitzgerald",
                "978-0743273565"
        );

        Novel novel = new Novel(
                "To Kill a Mockingbird",
                281,
                "J.B. Lippincott & Co.",
                1960,
                "English",
                "002",
                "Harper Lee",
                "978-0061120084",
                "Drama",
                new String[]{"Scout Finch", "Atticus Finch", "Jem Finch"}
        );

        Magazine magazine = new Magazine(
                "Time Magazine",
                90,
                "Time USA, LLC",
                2024,
                "English",
                "675",
                "November"
        );

        TechincalJournal technicalJournal = new TechincalJournal(
                "AI Research Journal",
                120,
                "Springer",
                2024,
                "English",
                "005",
                "Artificial Intelligence",
                4.7,
                "Volume 30",
                new String[]{"IEEE", "ACM", "Scopus"},
                new String[]{"Dr. John Smith", "Dr. Alice Johnson"}
        );

        Textbook textbook = new Textbook(
                "Introduction to Java Programming",
                1200,
                "Pearson",
                2019,
                "English",
                "012",
                "Programming",
                new String[]{"Y. Daniel Liang"}
        );

        System.out.println("Book Details:");
        book.printDetails();
        System.out.println();

        System.out.println("Novel Details:");
        novel.printDetails();
        System.out.println();

        System.out.println("Magazine Details:");
        magazine.printDetails();
        System.out.println();

        System.out.println("Technical Journal Details:");
        technicalJournal.printDetails();
        System.out.println();

        System.out.println("Textbook Details:");
        textbook.printDetails();


    }
}
