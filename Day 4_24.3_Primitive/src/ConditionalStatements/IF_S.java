package ConditionalStatements;

public class IF_S{
    private int age;

    public IF_S(int age) {
        this.age = age;
    }

    public boolean info() {
        if (this.age > 10) {
            System.out.println("Age Greater than 10");
        }
        return false;
    }

}