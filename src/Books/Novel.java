package Projects.Project2_Books;// Furkan Okumuş
// 220201070

public class Novel extends Book{

    private String genre;
    private String[] mainCharacters;

    public Novel(String title, int numberOfPages, String publisher, int yearOfPublication, String language, String issueNumber, String author, String ISBN, String genre, String[] mainCharacters) {
        super(title, numberOfPages, publisher, yearOfPublication, language, issueNumber, author, ISBN);
        this.genre = genre;
        this.mainCharacters = mainCharacters;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Genre: " + genre);
        System.out.print("Main Characters: ");
        for (int i = 0; i < mainCharacters.length; i++) {
            System.out.print(mainCharacters[i]);
            if (i < mainCharacters.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
