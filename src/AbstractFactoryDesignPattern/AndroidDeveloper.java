package AbstractFactoryDesignPattern;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        return 70000;
    }

    @Override
    public String name() {
        return "I am a Android developer";
    }
}
