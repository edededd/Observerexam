package observer;
import java.util.logging.Logger;
import observable.Airline;
public class User implements Observer {

    private double tarifa;
    private double tiempo;
    private String name;
    private Logger logger= Logger.getLogger(User.class.getName());

    public User(double tar, double tim, String nam){
        this.tarifa = tar;
        this.tiempo = tim;
        this.name = nam;
    }
    
    @Override
    public void update(Airline a){
        String x= this.name + "Ha matcheado con: " + a.getName();
        logger.info(x);
    }

    public double getTiempo(){
        return tiempo;
    }
    public double getTarifa(){
        return tarifa;
    }
}
