package EnumAndInterfacesTask.MyInterface;

public class Parrot implements Enjoyable, Noisable{
    @Override
    public void BeNice() {
        System.out.println("Parrots are nice");
    }

    @Override
    public void toBeLoud() {
        System.out.println("Parrots can be loud");
    }
}
