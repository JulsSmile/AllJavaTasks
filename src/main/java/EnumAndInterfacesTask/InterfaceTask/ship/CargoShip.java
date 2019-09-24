package EnumAndInterfacesTask.InterfaceTask.ship;

import EnumAndInterfacesTask.InterfaceTask.features.Floatable;

public class CargoShip implements Floatable{
    @Override
    public void sail() {
        System.out.println("CargoShip implements Interface Ship");
    }
}
