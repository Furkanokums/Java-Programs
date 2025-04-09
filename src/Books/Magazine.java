package Projects.Project2_Books;// Furkan Okumuş
// 220201070

public class Magazine extends Reading{

    protected String month;

    public Magazine(String title, int numberOfPages, String publisher, int yearOfPublication, String language, String issueNumber, String month) {
        super(title, numberOfPages, publisher, yearOfPublication, language, issueNumber);
        this.month = month;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Month: " + month);
    }
}
