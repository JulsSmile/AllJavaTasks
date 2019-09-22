package EnumAndInterfacesTask.MyInterface;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Noisable noisable = new Parrot();
        Enjoyable enjoyable = new Puppy();
        Enjoyable enjoyable1 = new Cat();

        ArrayList<Enjoyable> animals = new ArrayList<>();
        animals.add((Enjoyable) noisable);
        animals.add(enjoyable);
        animals.add(enjoyable1);
        for (Enjoyable enjoyables : animals){
            enjoyables.BeNice();
        }
        Noisable noisable1 = new Parrot();
        noisable.toBeLoud();
    }
}
