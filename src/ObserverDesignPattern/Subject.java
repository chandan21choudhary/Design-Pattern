package ObserverDesignPattern;

public interface Subject {

      public void subscribe(Observer obs);

      public void unsubscribe(Observer obs);

      public void newVideoUploaded(String title);


}