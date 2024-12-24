package AbstractFactoryDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        return "I am a web developer";
    }
}
