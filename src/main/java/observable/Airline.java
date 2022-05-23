package observable;
public class Airline {
    
    private double tarifa;
    private double tiempo;
    private String name;

    public Airline(double tar, double tie, String nam){
        this.tarifa = tar;
        this.tiempo = tie;
        this.name =nam;
    }

    public double getTarifa() {
        return tarifa;
    }

    public double getTiempo() {
        return tiempo;
    }
    public String getName(){
        return name;
    }

}
