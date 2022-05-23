package observable;
import observer.Observer;

public interface Observable {

    public void addObserver(Observer o);
    public void removeObserver(Observer o);

    public void notifyObs(Observer o, Airline a);

}
