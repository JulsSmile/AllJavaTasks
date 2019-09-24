package EnumAndInterfacesTask.InterfaceTask.ship;

public class Tanker extends CargoShip {
    @Override
    public void sail() {
        super.sail();
        System.out.println("Tanker extends CargoShip");
    }
}
