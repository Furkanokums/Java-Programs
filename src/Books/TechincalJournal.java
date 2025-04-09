package Projects.Project2_Books;// Furkan Okumuş
// 220201070

public class TechincalJournal extends Reading{

    protected String scope;
    protected double impactFactor;
    protected String volumeNumber;
    protected String[] indexingList;
    protected String[] editorialBoard;


    public TechincalJournal(String title, int numberOfPages, String publisher, int yearOfPublication, String language, String issueNumber, String scope, double impactFactor, String volumeNumber, String[] indexingList, String[] editorialBoard) {
        super(title, numberOfPages, publisher, yearOfPublication, language, issueNumber);
        this.scope = scope;
        this.impactFactor = impactFactor;
        this.volumeNumber = volumeNumber;
        this.indexingList = indexingList;
        this.editorialBoard = editorialBoard;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Scope: " + scope);
        System.out.println("Impact Factor: " + impactFactor );
        System.out.println("Volume Number: " + volumeNumber);
        System.out.print("Indexing List: ");
        for (int i = 0; i < indexingList.length; i++) {
            System.out.print(indexingList[i]);
            if (i < indexingList.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("Editorial Board: ");
        for (int i = 0; i < editorialBoard.length; i++) {
            System.out.print(editorialBoard[i]);
            if (i < editorialBoard.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}
