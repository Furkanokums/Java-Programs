package Projects.Project2_Books;// Furkan Okumuş
// 220201070

public class Book extends Reading{

    protected String author;
    protected String ISBN;

    public Book(String title, int numberOfPages, String publisher, int yearOfPublication, String language, String issueNumber, String author, String ISBN) {
        super(title, numberOfPages, publisher, yearOfPublication, language, issueNumber);
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}
