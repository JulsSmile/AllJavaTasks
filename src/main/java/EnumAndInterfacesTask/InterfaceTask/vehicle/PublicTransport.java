package EnumAndInterfacesTask.InterfaceTask.vehicle;

public abstract class PublicTransport implements Vehicle {
    @Override
    public void move() {
        System.out.println("Public Transport implements Vehicle");
    }
}
