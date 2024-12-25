import AbstractFactoryDesignPattern.Employee;
import AbstractFactoryDesignPattern.EmployeeFactory;
import AbstractFactoryDesignPattern.WebDevFactory;
import BuilderDesignPattern.User;
import FactoryDesignPattern.Shape;
import FactoryDesignPattern.ShapeDrawn;
import ObserverDesignPattern.Observer;
import ObserverDesignPattern.ObserverImpl;
import ObserverDesignPattern.Subject;
import ObserverDesignPattern.Youtube;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        observerDesignPattern();
        factoryDesignPattern();
        abstractFactoryDesignPattern();

       User user= new User.UserBuilder().setUserId("01").setUserName("Chandan").build();
        System.out.println(user);

    }

    private static void abstractFactoryDesignPattern() {
        //Abstract factory design pattern is a creational design pattern
        //It is one level higher then factory design pattern by adding one more abstraction layer
        // to return factory of families or dependent objects but without specefying thier concnreate
        //subclasses
        //
       Employee e= EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println(e.name()+" "+"my salary is:"+e.salary());
    }

    private static void factoryDesignPattern() {
        /*when there is requirement of keeping separate
        of creating objects and its implementation, go with factory design
        *  A Factory Pattern or Factory Method Pattern says that just define an interface or
        abstract class for creating an object but let the subclasses decide which class to
        instantiate.
        In other words, subclasses are responsible to create the instance of the class.
        * */

        ShapeDrawn shapeDrawn= new ShapeDrawn();
        System.out.println("Enter the shape: \n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input= null;
        try {
            input = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Shape shape=shapeDrawn.getShape(input);
        if(shape!=null) {
            shape.draw();
        }else{
            System.out.println("Invalid Input");
        }
    }

    private static void observerDesignPattern() {
        /* Ita kind of behavioural design pattern, it focus on how two or more objects interacts
         In this when a objects behaviour changed then all its dependent object gets notified
        *Real example is youtube, when a video gets uploaded all the subscribers gets notified.
        * */
        Observer Aman= new ObserverImpl("Aman");
        Observer vivian= new ObserverImpl("Vivian");
        Subject sub1= new Youtube();
        sub1.subscribe(Aman);
        sub1.subscribe(vivian);
        sub1.newVideoUploaded("Obersver Design Pattern");
    }
}