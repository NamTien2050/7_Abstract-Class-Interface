package A_AnimalClassAndInterfaceEdible;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        Fruit[] fruits= new Fruit[2];
        fruits[0]=new Apple();
        fruits[1]=new Strawberry();
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal i : animals) {
               System.out.println(i.makeSound());
               if(i instanceof Chicken){
                   Edible edibler=(Chicken)i;
                   System.out.println(edibler.howToEat());
               }
        }
        for (Fruit j: fruits){
            System.out.println(j.howToPeel()+"\n"+j.howToEat());

        }
    }
}
