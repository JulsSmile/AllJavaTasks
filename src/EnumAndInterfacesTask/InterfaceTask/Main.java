package EnumAndInterfacesTask.InterfaceTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Floatable cargoship = new CargoShip();
        Floatable tanker = new Tanker();
        Floatable aerocarrier = new Aerocarrier();
        Floatable warship = new Warship() {
            @Override
            public void sail() {
                super.sail();
            }
        };
        Vehicle tram = new Tram();
        Vehicle publicTransport = new PublicTransport() {
            @Override
            public void move() {
                super.move();
            }
        };

        ArrayList<Floatable> ships = new ArrayList<>();
        ships.add(cargoship);
        ships.add(tanker);
        ships.add(aerocarrier);
        ships.add(warship);
        for (Floatable ship : ships){
            ship.sail();
        }
        ArrayList<Vehicle> transport = new ArrayList<>();
        transport.add(tram);
        transport.add(publicTransport);
        transport.add((Vehicle) warship);
        for (Vehicle vehicle : transport){
            vehicle.move();
        }
    }
}
