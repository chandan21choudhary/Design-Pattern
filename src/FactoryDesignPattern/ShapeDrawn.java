package FactoryDesignPattern;

public class ShapeDrawn {

    public Shape getShape(String input){

        switch (input){

            case "circle" : return new Circle();
            case "triangle" : return new Triangle();
            case "rectangle": return new Rectangle();

        }

        return null;
    }
}
