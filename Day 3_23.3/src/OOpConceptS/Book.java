package OOpConceptS;

public class Book {
    private int noOfCopies;

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies1) {
        if(noOfCopies1>0)
               System.out.println(this.noOfCopies = noOfCopies1);
        else
        {
            System.out.println(this.noOfCopies=0);
        }

    }
    public void increasespeed(int howmuch){
        this.noOfCopies=this.noOfCopies+howmuch;
        System.out.println(this.noOfCopies);
    }
    public void Decrease(int howmuchdecrese){
        this.noOfCopies=this.noOfCopies-howmuchdecrese;
    }
}
