package AbstractFactoryDesignPattern;

public class AndroidDevFactory implements AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
