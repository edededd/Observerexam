import observable.Airline;
import observable.SkyAlert;
import observer.User;
public class App {
    
    public static void main(String[] args){
        SkyAlert sk = new SkyAlert();
        Airline a1 = new Airline(20,3,"a");
        Airline a2 = new Airline(30,4,"b");
        Airline a3 = new Airline(40,5,"c");
        User u1 = new User(20,3,"d");
        User u2 = new User(30, 3,"e");
        User u3 = new User(40,5,"f");
        User u4 = new User(40,4,"g");
        User u5 = new User(40,52,"h");
        sk.addObserver(u1);
        sk.addObserver(u2);
        sk.addObserver(u3);
        sk.addObserver(u4);
        sk.addObserver(u5);
        sk.addAerolinea(a1);
        sk.addAerolinea(a2);
        sk.addAerolinea(a3);
        sk.getNot();
        //aa
    }

}
