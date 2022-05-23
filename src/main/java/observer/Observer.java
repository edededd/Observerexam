package observer;

import observable.Airline;
public interface Observer {
    public void update(Airline a);
    public double getTarifa();
    public double getTiempo();
}
