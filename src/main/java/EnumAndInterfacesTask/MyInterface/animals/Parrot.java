package EnumAndInterfacesTask.MyInterface.animals;

import EnumAndInterfacesTask.MyInterface.features.Enjoyable;
import EnumAndInterfacesTask.MyInterface.features.Noisable;

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
