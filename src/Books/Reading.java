package Projects.Project2_Books;// Furkan Okumuş
// 220201070

public class Reading {

    protected String title;
    protected int numberOfPages;
    protected String publisher;
    protected int yearOfPublication;
    protected String language;
    protected String issueNumber;


    public Reading(String title, int numberOfPages, String publisher, int yearOfPublication, String language, String issueNumber) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.language = language;
        this.issueNumber = issueNumber;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year of Publication: " + yearOfPublication);
        System.out.println("Language: " + language);
        System.out.println("Issue Number: " + issueNumber);
    }
}
