package InterfacePractice;

public class GamingColsoleRunner {
    public static void main(String[] args) {
        //GamingConsole mg = new ChessGame(); //Polymorphism
       GamingConsole mg = new MarioGame();
       // ChessGame mg=new ChessGame();
        //MarioGame mg=new MarioGame();

        mg.up();          //common Action.
        mg.down();
        mg.left();
        mg.right();

    }

}
