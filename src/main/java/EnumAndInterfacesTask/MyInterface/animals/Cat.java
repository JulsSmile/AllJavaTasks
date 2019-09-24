package EnumAndInterfacesTask.MyInterface.animals;

import EnumAndInterfacesTask.MyInterface.features.Enjoyable;

public class Cat implements Enjoyable{
    @Override
    public void BeNice() {
        System.out.println("Cats are nice");
    }
}
