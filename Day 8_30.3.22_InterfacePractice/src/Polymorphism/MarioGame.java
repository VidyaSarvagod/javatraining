package InterfacePractice1;

public class MarioGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Move to Up");

    }

    @Override
    public void down() {
        System.out.println("Move to Down");
    }

    @Override
    public void left() {
        System.out.println("Move to left");
    }

    @Override
    public void right() {
        System.out.println("Move to Right");

    }
}
