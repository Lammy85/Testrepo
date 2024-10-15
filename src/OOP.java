import java.sql.SQLOutput;
import java.util.ArrayList;

public class OOP {
    public static void main(String[] args) {
        //Erstellen eines neuen Auto-Objekts
        Car auto1 = new Car("Opel", "Kadett-E", 1987);
        Car auto2 = new Car("Audi", "A6", 2010);

        ArrayList<Car> autos = new ArrayList<>();

        autos.add(auto1);
        autos.add(auto2);

        for (Car car : autos) { //Verkürzte Schreibweise eines for-Loops
            car.infos();
        }

        //Methode aufrufen
        auto1.fahren();

        //Baujahr mit Setter ändern
        System.out.println(auto2.getBaujahr());
        auto2.setBaujahr(2008);
        System.out.println(auto2.getBaujahr());

    }
}
