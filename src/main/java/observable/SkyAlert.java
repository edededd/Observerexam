package observable;
import java.util.ArrayList;
import java.util.List;

import observer.Observer;


public class SkyAlert implements Observable{
    private List<Observer> lo;
    private List<Airline> la;
    
    public SkyAlert(){
        lo = new ArrayList<Observer>();
        la = new ArrayList<Airline>();
    }

    @Override
    public void addObserver(Observer o){
        lo.add(o);
    }

    @Override
    public void removeObserver(Observer o){
        lo.remove(o);
    }

    @Override
    public void notifyObs(Observer o, Airline a){
        o.update(a);
    }

    public void addAerolinea(Airline a1) {
        la.add(a1);
    }

    public void getNot(){
        for(Observer o: lo){
            for(Airline a: la){
                if(a.getTarifa() == o.getTarifa() && a.getTiempo() == o.getTiempo()){
                      notifyObs(o,a);
                }
            }
        }
    }

}
