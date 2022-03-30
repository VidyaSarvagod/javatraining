package InterfacePractice1;

public class ChessGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Move to Up in Chess");
    }

    @Override
    public void down() {
        System.out.println("Move to Down in Chess");
    }

    @Override
    public void left() {
        System.out.println("Move to left in Chess");
    }

    @Override
    public void right() {
        System.out.println("Move to Right in Chess");
    }
}
