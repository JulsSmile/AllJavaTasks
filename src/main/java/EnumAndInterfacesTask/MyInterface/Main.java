package EnumAndInterfacesTask.MyInterface;

import EnumAndInterfacesTask.MyInterface.animals.Cat;
import EnumAndInterfacesTask.MyInterface.animals.Parrot;
import EnumAndInterfacesTask.MyInterface.animals.Puppy;
import EnumAndInterfacesTask.MyInterface.features.Enjoyable;
import EnumAndInterfacesTask.MyInterface.features.Noisable;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Noisable noisable = (Noisable) new Parrot();
        Enjoyable enjoyable = new Puppy();
        Enjoyable enjoyable1 = (Enjoyable) new Cat();

        ArrayList<Enjoyable> animals = new ArrayList<Enjoyable>();
        animals.add((Enjoyable) noisable);
        animals.add(enjoyable);
        animals.add(enjoyable1);
        for (Enjoyable enjoyables : animals){
            enjoyables.BeNice();
        }
        Noisable noisable1 = (Noisable) new Parrot();
        noisable.toBeLoud();
    }
}
