package OOpConceptS;

public class BookRunner {
   public static void main(String[] args){
       Book javabook=new Book(100);
       Book pythonbook=new Book(200);
       Book htmlbook=new Book(300);
       System.out.println(javabook.getNoOfCopies());
       System.out.println(htmlbook.getNoOfCopies());
       System.out.println(pythonbook.getNoOfCopies());

       javabook.setNoOfCopies(10);
       javabook.increasecopy(10);
       javabook.Decreasecopy(10);

       System.out.println("******************************************************");

       pythonbook.setNoOfCopies(30);
       pythonbook.increasecopy(30);
       pythonbook.Decreasecopy(50);

       System.out.println("******************************************************");
       htmlbook.setNoOfCopies(70);
       htmlbook.increasecopy(30);
       htmlbook.Decreasecopy(50);

       System.out.println("******************************************************");

       System.out.println(javabook.getNoOfCopies());
       System.out.println(htmlbook.getNoOfCopies());
       System.out.println(pythonbook.getNoOfCopies());

      // pythonbook.setNoOfCopies(20);
      // htmlbook.setNoOfCopies(30);
      // System.out.println(javabook.getNoOfCopies());

      // pythonbook.setNoOfCopies(30);
      // System.out.println(pythonbook.getNoOfCopies());

       //htmlbook.setNoOfCopies(50);
       //System.out.println(htmlbook.getNoOfCopies());










   }
}
