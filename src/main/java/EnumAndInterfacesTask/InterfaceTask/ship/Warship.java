package EnumAndInterfacesTask.InterfaceTask.ship;

import EnumAndInterfacesTask.InterfaceTask.features.Floatable;
import EnumAndInterfacesTask.InterfaceTask.vehicle.Vehicle;

public abstract class Warship implements Floatable, Vehicle{
    @Override
    public void sail() {
        System.out.println("Warship implements Floatable");
            }

    @Override
    public void move() {
        System.out.println("Warship implements Vehicle");
    }
}
