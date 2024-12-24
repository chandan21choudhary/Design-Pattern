package AbstractFactoryDesignPattern;

public class WebDevFactory implements AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
