package ObserverDesignPattern;

import java.sql.SQLOutput;

public class ObserverImpl implements Observer{
    private String name;
    public ObserverImpl(String name){
        this.name=name;
    }
    @Override
    public void notified(String title) {

        System.out.println("Hello"+" "+name+" "+"new video uploaded:"+" "+title);
    }
}
