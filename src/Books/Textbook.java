package Projects.Project2_Books;// Furkan Okumuş
// 220201070

public class Textbook extends Reading{

    protected String subject;
    protected String[] authors;

    public Textbook(String title, int numberOfPages, String publisher, int yearOfPublication, String language, String issueNumber, String subject, String[] authors) {
        super(title, numberOfPages, publisher, yearOfPublication, language, issueNumber);
        this.subject = subject;
        this.authors = authors;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Subject: " + subject);
        System.out.print("Authors: ");
        for (int i = 0; i < authors.length; i++) {
            System.out.print(authors[i]);
            if (i < authors.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

