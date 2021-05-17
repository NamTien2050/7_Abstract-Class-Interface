package A_AnimalClassAndInterfaceEdible;

public abstract class Fruit implements Edible{
    public abstract String howToPeel();

    @Override
    public String howToEat() {
        return " ";
    }
}
