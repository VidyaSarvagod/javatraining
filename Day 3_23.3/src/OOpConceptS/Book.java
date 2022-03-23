package OOpConceptS;

public class Book {
    private int noOfCopies;

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies1) {
        System.out.println(noOfCopies1);
        System.out.println(this.noOfCopies);
        this.noOfCopies = noOfCopies1;
    }
}
