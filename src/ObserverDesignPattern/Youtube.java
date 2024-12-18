package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject{

    private List<Observer> subscribers= new ArrayList<>();
    @Override
    public void subscribe(Observer obs) {
    subscribers.add(obs);
    }

    @Override
    public void unsubscribe(Observer obs) {
    subscribers.remove(obs);
    }

    @Override
    public void newVideoUploaded(String title) {
     for(Observer ob :subscribers){
         ob.notified(title);
     }
    }
}
