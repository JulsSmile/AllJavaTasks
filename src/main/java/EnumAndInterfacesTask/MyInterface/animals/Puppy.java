package EnumAndInterfacesTask.MyInterface.animals;

import EnumAndInterfacesTask.MyInterface.features.Enjoyable;

public class Puppy implements Enjoyable{
    @Override
    public void BeNice() {
        System.out.println("Puppies are nice");
    }
}
