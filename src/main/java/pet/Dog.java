package pet;

public class Dog extends Pet implements IPet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "barking!";
    }

    @Override
    public void greetOwner() {
        System.out.println("wag tail");
    }
}
